package com.ldx_first.demo_first.common;

import java.util.Date;
import java.util.HashMap;

public class Result<String, Object> extends HashMap {
    private Integer status;
    private Date queryTime;
    private String errorMsg;
    private Object data;

//    /**
//     * 这个是处理返回的,就是从这处理一下可以返回json
//     *
//     * @param status
//     * @param msg
//     * @param data
//     */
//    public Result(Integer status, String msg, Object data) {
//        this.queryTime = new Date();
//        this.status = status;
//        this.msg = msg;
//        this.data = data;
//        this.put("status", status);
//        this.put("msg", msg);
//        this.put("queryTime", queryTime);
//        this.put("data", data);
//    }

    public Result(String string) {

    }

    public Result(Integer status, String msg) {
        this.status = status;
        this.put("status", status);
    }

    public Result(Integer code, String errorMsg, Object obj) {
        this.status = code;
        this.data = obj;
        this.errorMsg = errorMsg;
        this.put("code", code);
        this.put("errorMsg", errorMsg);
        this.put("obj", obj);
    }
}
