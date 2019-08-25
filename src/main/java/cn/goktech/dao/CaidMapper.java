package cn.goktech.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.goktech.pojo.Caid;
import cn.goktech.pojo.CaidExample;
import cn.goktech.vo.CaidData;
import cn.goktech.vo.YonghCaid;

public interface CaidMapper {
	List<CaidData> selectGet1Cate();
	
    int countByExample(CaidExample example);

    int deleteByExample(CaidExample example);

    int deleteByPrimaryKey(String id);

    int insert(Caid record);

    int insertSelective(Caid record);

    List<Caid> selectByExample(CaidExample example);

    Caid selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Caid record, @Param("example") CaidExample example);

    int updateByExample(@Param("record") Caid record, @Param("example") CaidExample example);

    int updateByPrimaryKeySelective(Caid record);

    int updateByPrimaryKey(Caid record);

	List<YonghCaid> getUserOneQuanx(String quanxzId);

	List<YonghCaid> getUserSecQuanx(@Param("quanxzId")String quanxzId, @Param("id")String id);
}