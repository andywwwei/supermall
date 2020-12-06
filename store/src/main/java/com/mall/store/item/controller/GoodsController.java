package com.mall.store.item.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;

@RestController
@RequestMapping("goods")
public class GoodsController {

    @GetMapping("/select")
    public String select() {
        System.out.println("hello world！");
        return "hello world!";
    }


}
