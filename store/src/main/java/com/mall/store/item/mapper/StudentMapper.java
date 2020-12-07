package com.mall.store.item.mapper;

import com.mall.store.item.entity.StudentPO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentMapper {

    List<StudentPO> select();

}
