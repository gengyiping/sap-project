package com.sap.dto;

import com.sap.enums.ResultEnum;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 通用API接口返回
 * </p>
 *
 * @package: com.xkcoding.swagger.beauty.common
 * @description: 通用API接口返回
 * @author: yangkai.shen
 * @date: Created in 2018-11-28 14:18
 * @copyright: Copyright (c) 2018
 * @version: V1.0
 * @modified: yangkai.shen
 */
@Data
public class ApiResponse<T> implements Serializable {
    private static final long serialVersionUID = -8987146499044811408L;
    /**
     * 通用返回状态
     */
    private Integer code;
    /**
     * 通用返回信息
     */
    private String message;
    /**
     * 通用返回数据
     */
    private T data;

    public ApiResponse(ResultEnum resultEnum) {
        this.code = resultEnum.getCode();
        this.message = resultEnum.getMsg();
    }

    public ApiResponse(ResultEnum resultEnum, T data) {
        this.code = resultEnum.getCode();
        this.message = resultEnum.getMsg();
        this.data = data;
    }

    public ApiResponse(T data) {
        this.code = ResultEnum.SUCCESS.getCode();
        this.message = ResultEnum.SUCCESS.getMsg();
        this.data = data;
    }

    public static <T> ApiResponse success(T data) {
        return new ApiResponse(ResultEnum.SUCCESS, data);
    }

    public static ApiResponse success() {
        return new ApiResponse(ResultEnum.SUCCESS);
    }

    public static ApiResponse fail() {
        return new ApiResponse(ResultEnum.FAIL);
    }

    public static <T> ApiResponse fail(T data) {
        return new ApiResponse(ResultEnum.FAIL, data);
    }
}
