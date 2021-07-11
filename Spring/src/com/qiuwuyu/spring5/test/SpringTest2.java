package com.qiuwuyu.spring5.test;

import com.qiuwuyu.spring5.bean.BookStore;
import com.qiuwuyu.spring5.bean.Customer;
import com.qiuwuyu.spring5.bean.Student;
import com.qiuwuyu.spring5.service.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author paralog
 * @date 2021/7/11 10:02
 */
public class SpringTest2 {

    @Test
    public void testOutBean(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        UserServiceImpl userService = context.getBean("userService", UserServiceImpl.class);
        int i = userService.saveUser();
        System.out.println("inflect " + i + "  column");
    }

    @Test
    public void testInnerBean(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        Customer customer = context.getBean("customer", Customer.class);
        System.out.println(customer);
    }

    @Test
    public void testCollectBean(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        Student student = context.getBean("student", Student.class);
        System.out.println(student);
    }

    @Test
    public void testUseUtilBean(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        BookStore bookStore = context.getBean("bookStore", BookStore.class);
        System.out.println(bookStore);
    }

}
