package cn.goktech.dao;

import cn.goktech.pojo.Hexindatarepository;
import cn.goktech.pojo.HexindatarepositoryExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface HexindatarepositoryMapper {
    int countByExample(HexindatarepositoryExample example);

    int deleteByExample(HexindatarepositoryExample example);

    int insert(Hexindatarepository record);

    int insertSelective(Hexindatarepository record);

    List<Hexindatarepository> selectByExample(HexindatarepositoryExample example);

    int updateByExampleSelective(@Param("record") Hexindatarepository record, @Param("example") HexindatarepositoryExample example);

    int updateByExample(@Param("record") Hexindatarepository record, @Param("example") HexindatarepositoryExample example);

	List<Map<String, Object>> countData();
}