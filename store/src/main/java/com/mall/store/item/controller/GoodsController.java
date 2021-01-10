package com.mall.store.item.controller;

import com.mall.store.item.entity.StudentVO;
import com.mall.store.item.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.math.BigInteger;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("goods")
public class GoodsController {

    @Resource
    private StudentService studentService;

    @GetMapping("/select")
    public List<StudentVO> select() {
        List<StudentVO> select = studentService.select();
        log.error("hello,wrold!");
        System.out.println("hello world！");
        return select;
    }

}
