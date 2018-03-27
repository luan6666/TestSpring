package com.ldx_first.demo_first;

import com.ldx_first.demo_first.dao.NameMapper;
import com.ldx_first.demo_first.entity.Name;
import com.ldx_first.demo_first.entity.NameExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
public class Hello {

    @Autowired
    private NameMapper mapper;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String say() {
        return "Hello World";
    }

    @RequestMapping(value = "/save", method = RequestMethod.GET)
    public Map save(String name ,Integer password,Integer num,String remake) {
        Name record = new Name();
        Map<String,Object> map = new HashMap<>();
        record.setName(name);
        record.setPassword(password);
        record.setPhoneNum(num);
        record.setRemake(remake);
        Date date = new Date();
        map.put("name",name);
        map.put("status",1);
        map.put("queryTime",date);
        return map;
    }

    @RequestMapping(value = "/count", method = RequestMethod.GET)
    public Long count() {
        return mapper.countByExample(new NameExample());
    }
    @RequestMapping(value = "/find", method = RequestMethod.GET)
    public Map find() {
        Name name = mapper.selectByPrimaryKey(1);
        Map<String,Object> map = new HashMap<>();
        Date date = new Date();
        map.put("name",name);
        map.put("status",1);
        map.put("queryTime",date);
        return map;
    }

}
