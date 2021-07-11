package com.qiuwuyu.spring5.bean;

/**
 * @author paralog
 * @date 2021/7/11 9:31
 */
public class Person {
    private String address;

    @Override
    public String toString() {
        return "Person{" +
                "address='" + address + '\'' +
                '}';
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
