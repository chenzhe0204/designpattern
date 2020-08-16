package com.chenzhe.learn.design.pattern.simplefactory.utils;


import java.math.BigDecimal;

/**
 * 乘法
 * @author cz
 */
public class MultiplicationArithmetic implements Arithmetic {
    @Override
    public BigDecimal getResult(BigDecimal a, BigDecimal b) {
        return a.multiply(b);
    }
}
