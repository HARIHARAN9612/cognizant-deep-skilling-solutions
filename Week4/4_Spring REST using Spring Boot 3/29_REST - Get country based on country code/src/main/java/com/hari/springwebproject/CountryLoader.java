package com.hari.springwebproject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CountryLoader {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        Country country = (Country) context.getBean("country");
        System.out.println("Country Loaded from XML: " + country);
    }
}