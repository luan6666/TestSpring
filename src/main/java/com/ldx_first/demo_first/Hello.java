package com.ldx_first.demo_first;

import com.ldx_first.demo_first.dao.NameMapper;
import com.ldx_first.demo_first.entity.Name;
import com.ldx_first.demo_first.entity.NameExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @Autowired
    private NameMapper mapper;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String say() {
        return "Hello World";
    }

    @RequestMapping(value = "/save", method = RequestMethod.GET)
    public Integer save() {
        Name record = new Name();
        record.setName("名字1");
        record.setPassword(123);
        record.setPhoneNum(110);
        record.setRemake("第一次");

        return mapper.insertSelective(record);
    }

    @RequestMapping(value = "/count", method = RequestMethod.GET)
    public Long count() {
        return mapper.countByExample(new NameExample());
    }

}
