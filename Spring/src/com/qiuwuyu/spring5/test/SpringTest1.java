package com.qiuwuyu.spring5.test;

import com.qiuwuyu.spring5.bean.Person;
import com.qiuwuyu.spring5.bean.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author paralog
 * @date 2021/7/11 8:40
 */
public class SpringTest1 {

    @Test
    public void testUser() {
        //1.加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        //2.获取配置创建的对象
        User user = context.getBean("user", User.class);
        user.add();
    }

    @Test
    public void testBook() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        User.Book book = context.getBean("book", User.Book.class);
        book.sayMyName();
    }

    @Test
    public void testOrder(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Object order = context.getBean("order");
        System.out.println(order);
    }

    @Test
    public void testBook1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        User.Book book = context.getBean("book2", User.Book.class);
        book.sayMyName();
    }

    @Test
    public void testPerson(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Person person = context.getBean("person", Person.class);
        System.out.println(person.toString());
    }

    @Test
    public void testPerson2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Person person = context.getBean("person2", Person.class);
        System.out.println(person.toString());
    }
}
