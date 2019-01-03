package com.ldx_first.demo_first.handler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class GlobalExceptionHandler {
    //本项目的所有异常处理,没有写完全,实际上要把所有的都处理一遍
    //现在只处理请求错误的异常了

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    private Map<String,Object> stringObjectMap(HttpServletRequest request,Exception e){
        Map<String,Object> modelMap = new HashMap<>();
        modelMap.put("success",false);
        modelMap.put("errMsg",e.getMessage());
        return modelMap;
    }
}

