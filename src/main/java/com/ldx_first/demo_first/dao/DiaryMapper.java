package com.ldx_first.demo_first.dao;

import com.ldx_first.demo_first.entity.Diary;
import com.ldx_first.demo_first.entity.DiaryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DiaryMapper {
    long countByExample(DiaryExample example);

    int deleteByExample(DiaryExample example);

    int deleteByPrimaryKey(Integer iddiary);

    int insert(Diary record);

    int insertSelective(Diary record);

    List<Diary> selectByExampleWithBLOBs(DiaryExample example);

    List<Diary> selectByExample(DiaryExample example);

    Diary selectByPrimaryKey(Integer iddiary);

    int updateByExampleSelective(@Param("record") Diary record, @Param("example") DiaryExample example);

    int updateByExampleWithBLOBs(@Param("record") Diary record, @Param("example") DiaryExample example);

    int updateByExample(@Param("record") Diary record, @Param("example") DiaryExample example);

    int updateByPrimaryKeySelective(Diary record);

    int updateByPrimaryKeyWithBLOBs(Diary record);

    int updateByPrimaryKey(Diary record);
}