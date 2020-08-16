package com.chenzhe.learn.design.pattern.common.mode;

import lombok.Data;

/**
 * 简单统一返回模型
 * @author cz
 */
@Data
public class SimpleResultVO {
    /** 返回编码 */
    private String code;

    /** 返回信息 */
    private String message;
}
