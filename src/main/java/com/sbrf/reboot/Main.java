package com.sbrf.reboot;

import com.sbrf.reboot.spring.Account2;
import com.sbrf.reboot.spring.ApplicationContextTest;
import com.sbrf.reboot.spring.Client;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        getAnnotationConfigContext();
        getClassPathXMLContext();
    }

    public static void getAnnotationConfigContext(){
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationContextTest.class);
        Client client = context.getBean(Client.class);
        System.out.println(client.getName());
        System.out.println(client.getAccount());
    }

    public static void getClassPathXMLContext(){
        ApplicationContext xmlContext = new ClassPathXmlApplicationContext("context.xml");
        Client client = xmlContext.getBean(Client.class);
        System.out.println(client.getName());
        System.out.println(client.getAccount());
    }
}
