package com.mall.store.item.service.impl;

import com.mall.store.item.entity.StudentPO;
import com.mall.store.item.entity.StudentVO;
import com.mall.store.item.mapper.StudentMapper;
import com.mall.store.item.service.StudentService;
import lombok.Builder;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentMapper studentMapper;

    @Override
    public List<StudentVO> select() {
        List<StudentPO> select = studentMapper.select();
        List<StudentVO> studentVOS = this.BuildListStudentVO(select);
        System.out.println(select);
        return studentVOS;
    }


    private List<StudentVO> BuildListStudentVO(List<StudentPO> studentPOS){
        return CollectionUtils.isEmpty(studentPOS) ? Collections.emptyList() : (List)studentPOS.stream().map((item) -> {
            return this.BuildStudentVO(item);
        }).collect(Collectors.toList());
    }

    private StudentVO BuildStudentVO(StudentPO studentPO){
        return studentPO == null ? null : StudentVO.builder().id(studentPO.getId()).name(studentPO.getName()).age(studentPO.getAge()).build();
    }

}
