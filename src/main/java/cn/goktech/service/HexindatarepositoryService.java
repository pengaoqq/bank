package cn.goktech.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.goktech.dao.HexindatarepositoryMapper;
import cn.goktech.pojo.Hexindatarepository;
import cn.goktech.pojo.HexindatarepositoryExample;
import cn.goktech.pojo.HexindatarepositoryExample.Criteria;

@Service
public class HexindatarepositoryService {
	@Autowired
	private HexindatarepositoryMapper hexindatarepositoryMapper;

	public PageInfo<Hexindatarepository> getAll(int pageNumber, int pageSize, String gsmc) {
		PageHelper.startPage(pageNumber, pageSize);
		HexindatarepositoryExample example = new HexindatarepositoryExample();
		Criteria ctr = example.createCriteria();
		if(!StringUtils.isEmpty(gsmc)) {
			System.out.println(gsmc);
			ctr.andGsmcLike("%" + gsmc + "%");
		}
		List<Hexindatarepository> list = hexindatarepositoryMapper.selectByExample(example);
		PageInfo<Hexindatarepository> pageInfo = new PageInfo<>(list);
		return pageInfo;
	}

	public List<Hexindatarepository> getAllFail() {
		HexindatarepositoryExample example = new HexindatarepositoryExample();
		Criteria criteria = example.createCriteria();
		criteria.andZhztEqualTo("2");
		List<Hexindatarepository> lists = hexindatarepositoryMapper.selectByExample(example);
		return lists;
	}

	public List<Map<String, Object>> countData() {
		List<Map<String, Object>> lists = hexindatarepositoryMapper.countData();
		System.out.println(lists);
		for (Map<String, Object> map : lists) {
			if(map.get("ZHZT").equals("1")) {
				map.put("name", "年检成功");
			}else if(map.get("ZHZT").equals("2")) {
				map.put("name", "年检失败");
			}else if(map.get("ZHZT").equals("A")) {
				map.put("name", "信息错误");
			}else {
				map.put("name", "等待年检");
			}
			map.put("value", map.get("VALUE"));
		}
		return lists;
	}

}
