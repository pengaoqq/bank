package cn.goktech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.goktech.dao.QuanxglMapper;
import cn.goktech.pojo.Quanxgl;
import cn.goktech.pojo.QuanxglExample;

@Service
public class QuanxglService {
	@Autowired
	private QuanxglMapper quanxglMapper;

	public List<Quanxgl> getUserRights(String quanxId) {
		QuanxglExample example = new QuanxglExample();
		example.createCriteria().andQuanxidEqualTo(quanxId);
		return quanxglMapper.selectByExample(example);
	}
	

}
