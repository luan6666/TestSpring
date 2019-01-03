package com.ldx_first.demo_first;

import com.ldx_first.demo_first.common.Result;
import net.minidev.json.JSONObject;
import okhttp3.FormBody;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okio.BufferedSink;
import org.springframework.web.bind.annotation.RequestBody;

import java.io.IOException;
import java.util.*;

public class TestJava {

    public static void main(String[] args) {
        List<Map<String, String>> list = new ArrayList<>();
        Map<String, String> map = new HashMap<>();
        map.put("code", "123");
        map.put("code1","");
        map.put("code2","2");
        map.put("code3","3");
        list.add(map);
        String nice= "nice";
        for (Map<String, String> stringStringMap : list) {
            if(stringStringMap.equals("")){
                list.remove(stringStringMap);
            }
        }

        System.out.println(list.toString());
    }

}
