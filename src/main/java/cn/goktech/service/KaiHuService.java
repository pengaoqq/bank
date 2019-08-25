package cn.goktech.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.goktech.dao.DazyhkhMapper;
import cn.goktech.pojo.Dazyhkh;
import cn.goktech.pojo.DazyhkhExample;

@Service
public class KaiHuService {
	@Autowired
	private DazyhkhMapper dazyhkhMapper;

	public PageInfo getAll(int pageNumber, int pageSize) {
		PageHelper.startPage(pageNumber, pageSize);
		List<Dazyhkh> dazyhkhs = dazyhkhMapper.selectByExample(new DazyhkhExample());
		PageInfo<Dazyhkh> pageInfo = new PageInfo<>(dazyhkhs);
		return pageInfo;
	}

	public boolean save(Dazyhkh dazyhkh) {
		int i = dazyhkhMapper.insertSelective(dazyhkh);
		return i>0?true:false;
	}
}
