package com.chenzhe.learn.design.pattern.simplefactory.utils;

import java.math.BigDecimal;

/**
 * 加法
 * @author cz
 */
public class AddArithmetic implements Arithmetic {

    @Override
    public BigDecimal getResult(BigDecimal a, BigDecimal b) {
        return a.add(b);
    }
}
