// File: com/example/cab/Driver.java
// File: com/example/cab/CabApp.java
package com.example.cab;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCabApp {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("com/example/cab/ApplicationContext.xml");

        Booking booking = (Booking) context.getBean("booking");
        System.out.println(booking);
    }
}
