package cn.goktech.dao;

import cn.goktech.pojo.Riz;
import cn.goktech.pojo.RizExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RizMapper {
    int countByExample(RizExample example);

    int deleteByExample(RizExample example);

    int deleteByPrimaryKey(BigDecimal id);

    int insert(Riz record);

    int insertSelective(Riz record);

    List<Riz> selectByExample(RizExample example);

    Riz selectByPrimaryKey(BigDecimal id);

    int updateByExampleSelective(@Param("record") Riz record, @Param("example") RizExample example);

    int updateByExample(@Param("record") Riz record, @Param("example") RizExample example);

    int updateByPrimaryKeySelective(Riz record);

    int updateByPrimaryKey(Riz record);
}