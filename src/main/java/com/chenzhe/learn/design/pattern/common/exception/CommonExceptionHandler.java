package com.chenzhe.learn.design.pattern.common.exception;

import com.chenzhe.learn.design.pattern.common.mode.SimpleResultVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 统一异常处理
 * @author cz
 * @date 2020-08-15
 */
@ControllerAdvice
@Slf4j
public class CommonExceptionHandler {

    private final static String DELIMITER = "-";

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public SimpleResultVO exceptionHandler(Exception e) {
        SimpleResultVO simpleResultVO = new SimpleResultVO();
        String message = e.getMessage();
        if(message.contains(DELIMITER)){
            String[] split = message.split(DELIMITER);
            simpleResultVO.setCode(split[0]);
            simpleResultVO.setMessage(split[1]);
        }else{
            simpleResultVO.setCode(String.valueOf(HttpStatus.INTERNAL_SERVER_ERROR.value()));
            simpleResultVO.setMessage(e.getMessage());
        }
        log.error("ExceptionHandler捕获异常", e);
        return simpleResultVO;
    }
}
