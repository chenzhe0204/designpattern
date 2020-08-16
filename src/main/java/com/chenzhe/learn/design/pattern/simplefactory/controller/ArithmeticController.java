package com.chenzhe.learn.design.pattern.simplefactory.controller;

import com.chenzhe.learn.design.pattern.simplefactory.dto.ArithmeticDTO;
import com.chenzhe.learn.design.pattern.simplefactory.exception.ArithmeticException;
import com.chenzhe.learn.design.pattern.simplefactory.service.ArithmeticService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.math.BigDecimal;

/**
 * 简单工厂(计算器)Controller
 * @author cz
 * @date 2020-08-15
 */
@RestController
@Slf4j
@RequiredArgsConstructor(onConstructor_={@Autowired})
@RequestMapping("/simpleFactory")
public class ArithmeticController {

    private final ArithmeticService arithmeticService;

    @PostMapping("/arithmetic")
    public BigDecimal getResult(@Validated @RequestBody ArithmeticDTO arithmeticDTO) throws ArithmeticException {
        return arithmeticService.getResult(arithmeticDTO);
    }
}
