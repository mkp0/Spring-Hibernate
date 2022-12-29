package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OurApp {
    public static void main(String[] args){
//        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        EmailClient bean1 = context.getBean("Parent",EmailClient.class);
        EmailClient bean2 = context.getBean("Parent",EmailClient.class);


        System.out.println(bean1);
        System.out.println(bean2);

        System.out.println(bean2.CheckSpelling());

        ((AnnotationConfigApplicationContext) context).registerShutdownHook();
    }
}
