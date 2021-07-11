package com.qiuwuyu.spring5.bean;

import java.util.*;

/**
 * @author paralog
 * @date 2021/7/11 10:41
 */
public class Student {
    private String[] courses;
    private List<Integer> grades;

    private Map<String, Integer> map;
    private List<User.Book> books;

    public void creatMap() {
        for (int i = 0; i < courses.length; i++) {
            map.put(courses[i], grades.get(i));
        }
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public void setGrades(List<Integer> grades) {
        this.grades = grades;
    }

    public void setBooks(List<User.Book> books) {
        this.books = books;
    }

    public void setMap(Map<String, Integer> map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "Student{" +
                "courses=" + Arrays.toString(courses) +
                ", grades=" + grades +
                ", map=" + map +
                ", books=" + books +
                '}';
    }
}
