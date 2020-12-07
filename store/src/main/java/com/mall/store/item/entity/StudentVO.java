package com.mall.store.item.entity;

import lombok.Builder;
import lombok.Data;

@Data
public class StudentVO {

    private int id;
    private String name;
    private int age;


    public StudentVO() {
    }

    @Builder
    public StudentVO(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}
