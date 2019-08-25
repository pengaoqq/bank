package cn.goktech.dao;

import cn.goktech.pojo.Yongh;
import cn.goktech.pojo.YonghExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YonghMapper {
    int countByExample(YonghExample example);

    int deleteByExample(YonghExample example);

    int deleteByPrimaryKey(Object id);

    int insert(Yongh record);

    int insertSelective(Yongh record);

    List<Yongh> selectByExample(YonghExample example);

    Yongh selectByPrimaryKey(Object id);

    int updateByExampleSelective(@Param("record") Yongh record, @Param("example") YonghExample example);

    int updateByExample(@Param("record") Yongh record, @Param("example") YonghExample example);

    int updateByPrimaryKeySelective(Yongh record);

    int updateByPrimaryKey(Yongh record);
}