package com.mall.store.item.controller;

import com.mall.store.item.entity.StudentVO;
import com.mall.store.item.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.math.BigInteger;

@RestController
@RequestMapping("goods")
public class GoodsController {

    @Resource
    private StudentService studentService;

    @GetMapping("/select")
    public String select() {
        StudentVO select = studentService.select();
        System.out.println("hello world！");
        return "hello world!";
    }

}
