package com.sap.enums;

/**
 * @version 1.0.0
 * @author: lif
 * @date: 2020/10/24 12:06 上午
 * @description: 结果枚举类
 */
public enum ResultEnum {
    SUCCESS(200, "操作成功"),
    FAIL(201, "操作失败"),
    SCAN_ERROR(201, "扫码失败"),

    ;

    private Integer code;

    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
