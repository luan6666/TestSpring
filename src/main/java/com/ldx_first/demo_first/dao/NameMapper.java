package com.ldx_first.demo_first.dao;

import com.ldx_first.demo_first.entity.Name;
import com.ldx_first.demo_first.entity.NameExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NameMapper {

    long countByExample(NameExample example);

    int deleteByExample(NameExample example);

    int deleteByPrimaryKey(Integer personId);

    int insert(Name record);

    int insertSelective(Name record);

    List<Name> selectByExampleWithBLOBs(NameExample example);

    List<Name> selectByExample(NameExample example);

    Name selectByPrimaryKey(Integer personId);

    int updateByExampleSelective(@Param("record") Name record, @Param("example") NameExample example);

    int updateByExampleWithBLOBs(@Param("record") Name record, @Param("example") NameExample example);

    int updateByExample(@Param("record") Name record, @Param("example") NameExample example);

    int updateByPrimaryKeySelective(Name record);

    int updateByPrimaryKeyWithBLOBs(Name record);

    int updateByPrimaryKey(Name record);
}