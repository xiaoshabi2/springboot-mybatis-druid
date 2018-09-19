package com.example.demo.entity;


/**
 * @program: Druid
 * @description:
 * @author: ChenYu
 * @create: 2018-09-19 15:34
 * */

public class City {
    private Integer id;
    private String name;
    private String introduce;

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", introduce='" + introduce + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }
}
