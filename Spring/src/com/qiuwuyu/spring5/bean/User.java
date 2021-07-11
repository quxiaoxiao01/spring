package com.qiuwuyu.spring5.bean;

/**
 * @author paralog
 * @date 2021/7/9 9:43
 */
public class User {

    public void add() {
        System.out.println("add");
    }

    /**
     * @author paralog
     * @date 2021/7/11 9:10
     */
    public static class Book {
        private String b_name;

        public void setB_name(String b_name) {
            this.b_name = b_name;
        }

        public void sayMyName() {
            System.out.println(b_name);
        }

        @Override
        public String toString() {
            return "Book{" +
                    "b_name='" + b_name + '\'' +
                    '}';
        }
    }

    /**
     * @author paralog
     * @date 2021/7/11 9:18
     */
    public static class Order {
        private String orderId;
        private String customer;

        public Order(String orderId, String customer) {
            this.orderId = orderId;
            this.customer = customer;
        }

        @Override
        public String toString() {
            return "Order{" +
                    "orderId='" + orderId + '\'' +
                    ", customer='" + customer + '\'' +
                    '}';
        }
    }
}
