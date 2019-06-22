package com.luoziyihao.demo.web.vo;

import lombok.Data;

/**
 * @author xiang.rao created on 2019/6/23 0:22
 * @version $
 */
@Data
public class ApiResult<T> {
    private T data;
    private int code;
    private String msg;

    private static final int SUCCESS = 0;

    public static <T> ApiResult<T> success(T data) {
        ApiResult<T> apiResult = new ApiResult<T>();
        apiResult.setData(data);
        apiResult.setCode(SUCCESS);
        return apiResult;
    }

    public static <T> ApiResult<T> success() {
        return success(null);
    }
}
