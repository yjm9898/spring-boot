package com.spring.springdatajpa.spring.result;

import lombok.Data;

/**
 * 通用的错误返回码
 */
@Data
public class CodeMsg {

    private int code;
    private String msg;


    // 通用异常  5001XX
    public static CodeMsg SUCCESS = new CodeMsg(0, "success");
    public static CodeMsg SERVER_ERROR = new CodeMsg(500100, "服务端异常");


    // 登录模块  5002XX



    // 商品模块  5003XX


    // 订单模块  5004XX



    public CodeMsg(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
