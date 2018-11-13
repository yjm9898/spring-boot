package com.spring.springdatajpa.spring.result;

import lombok.Data;

@Data
public class Result<T> {

    private int code;
    private String msg;

    private T data;

    /**
     * 返回成功+ data
     * @param data
     */
    private Result(T data) {
        this.code = 0;
        this.msg = "success";
        this.data = data;
    }

    /**
     * CodeMsg
     * @param codeMsg
     */
    private Result(CodeMsg codeMsg) {
        if (codeMsg == null) {
            return;
        }
        this.code = codeMsg.getCode();
        this.msg = codeMsg.getMsg();
    }


    /**
     * 返回成功结果集
     *
     * @param data
     * @param <T>
     * @return
     */
    public static <T> Result<T> success(T data) {
        return new Result<>(data);
    }

    /**
     * 自定义返回 不携带数据
     * @param codeMsg
     * @param <T>
     * @return
     */
    public static <T> Result<T> error(CodeMsg codeMsg) {
        return new Result<T>(codeMsg);
    }


}
