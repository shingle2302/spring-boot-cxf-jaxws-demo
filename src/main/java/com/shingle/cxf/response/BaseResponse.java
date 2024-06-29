package com.shingle.cxf.response;

import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Data
public class BaseResponse <T>{

    private static final Logger logger = LoggerFactory.getLogger(BaseResponse.class);

    private String message;
    private Boolean success;
    private T data;


    /**
     * 构建一个成功的响应对象。
     *
     * @param data 响应的数据部分，不应为null。
     * @param <T>  数据的泛型类型。
     * @return 成功的响应对象。
     */
    public static <T> BaseResponse success(T data) {
        // 参数校验
        if (data == null) {
            logger.error("Data to be returned is null.");
            throw new IllegalArgumentException("Data cannot be null.");
        }

        BaseResponse baseResponse = new BaseResponse();
        try {
            baseResponse.setSuccess(true);
            baseResponse.setData(data);

            // 这里可以添加对data的类型安全检查或其他必要的处理
            // 例如，如果知道T的某些特定约束，可以在这里进行检查

            return baseResponse;
        } catch (Exception e) {
            // 异常处理逻辑
            logger.error("Failed to create success response.", e);
            // 根据实际情况，这里可以选择抛出自定义异常，或者返回一个错误的响应对象
            throw new RuntimeException("Failed to process response.", e);
        }
    }
}
