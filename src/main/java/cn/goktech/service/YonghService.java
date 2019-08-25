package cn.goktech.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.goktech.dao.YonghMapper;
import cn.goktech.pojo.Quanx;
import cn.goktech.pojo.Yongh;
import cn.goktech.pojo.YonghExample;
import cn.goktech.pojo.YonghExample.Criteria;
import cn.goktech.util.ConstantsConfig;
import cn.goktech.util.Result;

@Service
public class YonghService {
	@Autowired
	private YonghMapper yonghMapper;
	
	public List<Yongh> getAll() {
		return yonghMapper.selectByExample(null);
	}
	
	/**
	 * 分页查询用户信息
	 * 
	 * @param pageNumber 第几页
	 * @param pageSize   每页显示几个
	 * @param zt 
	 * @param zh 
	 * @return
	 */
	public PageInfo getAll(int pageNumber, int pageSize, String zh, String zt) {
		PageHelper.startPage(pageNumber, pageSize);
		YonghExample yonghExample = new YonghExample();
		Criteria ctr = yonghExample.createCriteria();
		if(!StringUtils.isEmpty(zh)) {
			ctr.andYonghzhEqualTo(zh);
		}
		if(!StringUtils.isEmpty(zt)) {
			ctr.andZhanghztEqualTo(zt);
		}
		List<Yongh> YonghList = yonghMapper.selectByExample(yonghExample);
		PageInfo<Yongh> pageInfo = new PageInfo<>(YonghList);
		return pageInfo;
	}
	
	//登陆功能
	public Yongh login(String username, String password, HttpSession session) {
		YonghExample yonghExample = new YonghExample();
		Criteria ctr = yonghExample.createCriteria();
		ctr.andYonghzhEqualTo(username);
		ctr.andYonghmmEqualTo(password);
		List<Yongh> yonghLists = yonghMapper.selectByExample(yonghExample);
		if(yonghLists.size() > 0) {
			session.setAttribute(ConstantsConfig.SESSION_USER, yonghLists.get(0));
			return yonghLists.get(0);
		}
		return null;
	}

	public boolean update(Yongh yongh) {
		int index = yonghMapper.updateByPrimaryKeySelective(yongh);
		return index > 0 ? true : false;
	}
	
	public Yongh queryYonghById(String id) {
		YonghExample example = new YonghExample();
		YonghExample.Criteria criteria = example.createCriteria();
		criteria.andIdEqualTo(id);
		List<Yongh> yonghLists = yonghMapper.selectByExample(example);
		if (yonghLists.size() > 0) {
			return yonghLists.get(0);
		}
		return null;
	}

	public int updYongh(Yongh yongh) {
		int i = yonghMapper.updateByPrimaryKeySelective(yongh);
		return i > 0 ? 1 : 0;
	}

	public int delYongh(String id) {
		int i = yonghMapper.deleteByPrimaryKey(id);
		return i > 0 ? 1 : 0;
	}
	
	public int addYongh(Yongh yongh) {
		int i = yonghMapper.insertSelective(yongh);
		return i > 0 ? 1 : 0;
	}
	
}
