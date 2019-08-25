package cn.goktech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.goktech.dao.QuanxMapper;
import cn.goktech.pojo.Quanx;
import cn.goktech.pojo.QuanxExample;

@Service
public class QuanxService {
	@Autowired
	private QuanxMapper quanxMapper;
	
	public PageInfo getAll(int pageNumber, int pageSize) {
		PageHelper.startPage(pageNumber, pageSize);
		List<Quanx> quanxList = quanxMapper.selectByExample(new QuanxExample());
		PageInfo<Quanx> pageInfo = new PageInfo<>(quanxList);
		return pageInfo;
	}
	
	public int delQuanx(String id) {
		int i = quanxMapper.deleteByPrimaryKey(id);
		return i > 0 ? 1 : 0;
	}

	public Quanx queryQuanxById(String id) {
		QuanxExample quanxExample = new QuanxExample();
		QuanxExample.Criteria criteria = quanxExample.createCriteria();
		criteria.andIdEqualTo(id);
		List<Quanx> quanxLists = quanxMapper.selectByExample(quanxExample);
		if (quanxLists.size() > 0) {
			return quanxLists.get(0);
		}
		return null;
	}

	public int updQuanx(Quanx quanx) {
		int i = quanxMapper.updateByPrimaryKeySelective(quanx);
		return i > 0 ? 1 : 0;
	}

	public int addQuanx(Quanx quanx) {
		int i = quanxMapper.insertSelective(quanx);
		return i > 0 ? 1 : 0;
	}

}
