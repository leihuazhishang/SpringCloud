package com.springcloud.scweb.entity;

/**
 * @author hanlu
 * @date 2019/7/11 19:41
 */
public class Student {
    private  String name;
    private  Integer age;
    private  String xh;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getXh() {
        return xh;
    }

    public void setXh(String xh) {
        this.xh = xh;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", xh='" + xh + '\'' +
                '}';
    }
}
