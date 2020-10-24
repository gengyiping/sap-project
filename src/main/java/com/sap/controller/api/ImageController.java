package com.sap.controller.api;

import cn.hutool.core.util.StrUtil;
import com.sap.dto.ApiResponse;
import com.sap.enums.ResultEnum;
import com.spire.barcode.BarcodeScanner;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.misc.BASE64Decoder;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @version 1.0.0
 * @author: lif
 * @date: 2020/10/23 11:57 下午
 * @description: 图片处理
 */
@RestController
@RequestMapping("api/v1")
public class ImageController {

    @PostMapping(value = "/upload")
    public ApiResponse upload(String data) {
        if (StrUtil.isBlank(data) || !data.contains("base64,")) {
            return new ApiResponse(ResultEnum.SCAN_ERROR);
        }
        try {
            String[] datas = BarcodeScanner.scan(base64ToInputstream(data.split("base64,")[1]));
            if (datas.length > 0) {
                return ApiResponse.success(datas[0]);
            }
            return ApiResponse.fail();
        } catch (IOException e) {
            return ApiResponse.fail();
        }
    }

    /**
     * bast64转输入流
     *
     * @return
     */
    public static InputStream base64ToInputstream(String bast64) throws IOException {
        //将字符串转换为byte数组
        byte[] bytes = new BASE64Decoder().decodeBuffer(bast64.trim());
        //转化为输入流
        return new ByteArrayInputStream(bytes);
    }

}
