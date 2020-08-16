package com.chenzhe.learn.design.pattern.simplefactory.utils;

import java.math.BigDecimal;

/**
 * 减法
 * @author cz
 */
public class SubtractionArithmetic implements Arithmetic {

    @Override
    public BigDecimal getResult(BigDecimal a, BigDecimal b) {
        return a.subtract(b);
    }
}
