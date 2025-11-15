package com.tnsif.springcoreexample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
  public static void main(String[] args) {
    System.out.println("Hello World!");
    ApplicationContext var = new ClassPathXmlApplicationContext("springconfig.xml");
    Student s1=var.getBean("student1",Student.class);
    System.out.println(s1);
    Student s2=var.getBean("student2",Student.class);
    System.out.println(s2);
   
    
    
    
  }
} 
