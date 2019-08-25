package cn.goktech.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.goktech.dao.CaidMapper;
import cn.goktech.pojo.Caid;
import cn.goktech.pojo.CaidExample;
import cn.goktech.pojo.Quanxgl;
import cn.goktech.vo.CaidData;
import cn.goktech.vo.YonghCaid;

@Service
public class CaidService {
	@Autowired
	private CaidMapper caidMapper;
	@Autowired
	private QuanxglService quanxglService;

	public List<CaidData> getAll() {
		List<CaidData> parent = caidMapper.selectGet1Cate();
		for (CaidData caidData : parent) {
			CaidExample caidExample = new CaidExample();
			caidExample.createCriteria().andIdLike(caidData.getId() + "__");
			List<Caid> children = caidMapper.selectByExample(caidExample);
			caidData.setChildren(changeCaidData(children));
		}
		return parent;
	}

	private List<CaidData> changeCaidData(List<Caid> children) {
		List<CaidData> list = new ArrayList<CaidData>();
		for (Caid caid : children) {
			CaidData caidData = new CaidData();
			caidData.setId(caid.getId());
			caidData.setText(caid.getCaidmc());
			list.add(caidData);
		}
		return list;
	}

	public boolean save(Caid caid) {
		CaidExample example = new CaidExample();
		example.setOrderByClause("id desc");
		example.createCriteria().andIdLike(caid.getId() + "__");
		List<Caid> lists = caidMapper.selectByExample(example);
		Caid maxCaid = null;
		String finalId = "";
		System.out.println(lists.size() + "----");
		if(lists.size() > 0) {
			maxCaid = lists.get(0);
			String id = maxCaid.getId();
			String childid = id.substring(2);
			if(childid.charAt(0) == '0') {
				char last = childid.charAt(1);
				finalId = Integer.parseInt(last + "") + 1 + "";
				if(finalId.length() == 1) {
					finalId = "0" + finalId;
				}
			}else {
				finalId = Integer.parseInt(childid) + 1 + "";
			}
		}else {
			finalId = "01";
		}
		caid.setId(caid.getId() + finalId);
		int index = caidMapper.insertSelective(caid);
		return index > 0 ? true:false;
	}
	
	public int delete(Caid caid) {
		CaidExample example = new CaidExample();
		example.createCriteria().andIdEqualTo(caid.getId());
		return caidMapper.deleteByExample(example);
	}

	public int edit(Caid caid) {
		CaidExample example = new CaidExample();
		example.createCriteria().andIdEqualTo(caid.getId());
		return caidMapper.updateByExampleSelective(caid, example);
	}

	public List<CaidData> getAllCaidAndUserRights(String quanxId) {
		List<CaidData> all = getAll();
		List<Quanxgl> quanxList = quanxglService.getUserRights(quanxId);
		Map<String, Integer> quanxMap = new HashMap<String, Integer>();
		for (Quanxgl quanxgl : quanxList) {
			quanxMap.put(quanxgl.getQuanxid().toString(), 1);
		}
		for (CaidData caidData : all) {
			if(quanxMap.get(caidData.getId()) != null) {
				caidData.setChecked(true);
			}
			for (CaidData child : caidData.getChildren()) {
				if(quanxMap.get(child.getId()) != null) {
					child.setChecked(true);
				}
			}
		}
		return all;
	}

	public List<YonghCaid> getQuanxzAll(String quanxzId) {
		List<YonghCaid> onecate = caidMapper.getUserOneQuanx(quanxzId);
		for (YonghCaid yonghCaid : onecate) {
			List<YonghCaid> seccate = caidMapper.getUserSecQuanx(quanxzId, yonghCaid.getId());
			for (YonghCaid yonghCaid2 : seccate) {
				yonghCaid2.setParent(yonghCaid.getId());
			}
			yonghCaid.setChildMenus(seccate);
		}
		return onecate;
	}

}
