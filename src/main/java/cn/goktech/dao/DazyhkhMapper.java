package cn.goktech.dao;

import cn.goktech.pojo.Dazyhkh;
import cn.goktech.pojo.DazyhkhExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DazyhkhMapper {
    int countByExample(DazyhkhExample example);

    int deleteByExample(DazyhkhExample example);

    int deleteByPrimaryKey(Object id);

    int insert(Dazyhkh record);

    int insertSelective(Dazyhkh record);

    List<Dazyhkh> selectByExample(DazyhkhExample example);

    Dazyhkh selectByPrimaryKey(Object id);

    int updateByExampleSelective(@Param("record") Dazyhkh record, @Param("example") DazyhkhExample example);

    int updateByExample(@Param("record") Dazyhkh record, @Param("example") DazyhkhExample example);

    int updateByPrimaryKeySelective(Dazyhkh record);

    int updateByPrimaryKey(Dazyhkh record);
}