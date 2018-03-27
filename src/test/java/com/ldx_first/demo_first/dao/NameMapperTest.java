package com.ldx_first.demo_first.dao;

import com.ldx_first.demo_first.DemoFirstApplication;
import com.ldx_first.demo_first.entity.Name;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class NameMapperTest {

    @Autowired
    private NameMapper mapper;


    @Test
    public void countByExample() throws Exception {
    }

    @Test
    public void deleteByExample() throws Exception {
    }

    @Test
    public void deleteByPrimaryKey() throws Exception {
    }

    @Test
    public void insert() throws Exception {

    }

    @Test
    public void insertSelective() throws Exception {
        Name record = new Name();
        record.setName("名字2");
        record.setPassword(234);
        record.setPhoneNum(991);
        record.setRemake("第二次");
        mapper.insertSelective(record);
    }

    @Test
    public void selectByExampleWithBLOBs() throws Exception {
    }

    @Test
    public void selectByExample() throws Exception {
    }

    @Test
    public void selectByPrimaryKey() throws Exception {
        System.out.println(mapper.selectByPrimaryKey(2));

    }

    @Test
    public void updateByExampleSelective() throws Exception {
    }

    @Test
    public void updateByExampleWithBLOBs() throws Exception {
    }

    @Test
    public void updateByExample() throws Exception {
    }

    @Test
    public void updateByPrimaryKeySelective() throws Exception {
    }

    @Test
    public void updateByPrimaryKeyWithBLOBs() throws Exception {
    }

    @Test
    public void updateByPrimaryKey() throws Exception {
    }

}