package com.ldx_first.demo_first.service;

import com.ldx_first.demo_first.dao.DiaryMapper;
import com.ldx_first.demo_first.entity.Diary;
import com.ldx_first.demo_first.entity.DiaryExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = false)
public class DiaryService {

    @Autowired
    DiaryMapper diaryMapper;

    public int saveData(Diary diary) {
        int result = diaryMapper.insert(diary);
        return result;
    }

    public List getAll() {
        DiaryExample example = new DiaryExample();
        DiaryExample.Criteria criteria = example.createCriteria();
        criteria.andIddiaryIsNotNull();
        List<Diary> diaryList = diaryMapper.selectByExampleWithBLOBs(example);
        return diaryList;
    }
}
