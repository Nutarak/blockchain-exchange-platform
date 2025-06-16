package com.example.demo.common;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ApiResponse<String> handleAllExceptions(Exception e) {
        return ApiResponse.error(500, "服务器错误: " + e.getMessage());
    }

    // 可选添加更多类型的异常处理
}

