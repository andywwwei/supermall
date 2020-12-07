package com.mall.store.item.entity;

import lombok.Builder;
import lombok.Data;

@Data
public class StudentPO {

    private int id;
    private String name;
    private int age;


    public StudentPO() {
    }

    @Builder
    public StudentPO(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}
