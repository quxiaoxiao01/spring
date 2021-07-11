package com.qiuwuyu.spring5.bean;

/**
 * @author paralog
 * @date 2021/7/11 10:08
 */
public class Dept {
    private String d_name;

    public void setD_name(String d_name) {
        this.d_name = d_name;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "d_name='" + d_name + '\'' +
                '}';
    }
}
