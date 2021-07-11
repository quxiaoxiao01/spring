package com.qiuwuyu.spring5.bean;

import java.util.List;

/**
 * @author paralog
 * @date 2021/7/11 11:22
 */
public class BookStore {
    private List<String> lists;

    public void setLists(List<String> lists) {
        this.lists = lists;
    }

    @Override
    public String toString() {
        return "BookStore{" +
                "lists=" + lists +
                '}';
    }
}
