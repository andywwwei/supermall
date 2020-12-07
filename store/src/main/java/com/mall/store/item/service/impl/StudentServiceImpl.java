package com.mall.store.item.service.impl;

import com.mall.store.item.entity.StudentPO;
import com.mall.store.item.entity.StudentVO;
import com.mall.store.item.mapper.StudentMapper;
import com.mall.store.item.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentMapper studentMapper;

    @Override
    public StudentVO select() {
        List<StudentPO> select = studentMapper.select();
        System.out.println(select);
        return null;
    }
}
