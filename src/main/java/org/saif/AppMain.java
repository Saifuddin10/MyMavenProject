package org.saif;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {
    public static void main(String[] args) {
        // SPRING CONTAINER
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:configmetadata.xml");
        NewCustomer cus = (NewCustomer) context.getBean("customer");
        System.out.println("CUSTOMER NAME :  " +cus.getName());
        System.out.println("CUSTOMER CONTACT :  " +cus.getContact());
        System.out.println("CUSTOMER ADDRESS :  " +cus.getAddress());
    }
}
