package com.imooc.luckymoney;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;


@Controller
public class HelloController {


    @Value("${minMoney}")
    private BigDecimal minMoney;

    @GetMapping("/hello")
    @ResponseBody
    public String say(){
        return "hello wt: minMoney="+minMoney;
    }





}
