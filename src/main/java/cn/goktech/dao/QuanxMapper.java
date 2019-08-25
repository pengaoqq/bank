package cn.goktech.dao;

import cn.goktech.pojo.Quanx;
import cn.goktech.pojo.QuanxExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QuanxMapper {
    int countByExample(QuanxExample example);

    int deleteByExample(QuanxExample example);

    int deleteByPrimaryKey(Object id);

    int insert(Quanx record);

    int insertSelective(Quanx record);

    List<Quanx> selectByExample(QuanxExample example);

    Quanx selectByPrimaryKey(Object id);

    int updateByExampleSelective(@Param("record") Quanx record, @Param("example") QuanxExample example);

    int updateByExample(@Param("record") Quanx record, @Param("example") QuanxExample example);

    int updateByPrimaryKeySelective(Quanx record);

    int updateByPrimaryKey(Quanx record);
}