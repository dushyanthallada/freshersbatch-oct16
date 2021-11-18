package com.Annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfig.class);
		System.out.println("Beans.xml file loaded");
		College college =context.getBean("collegeBean",College.class);
				System.out.println("the collge object created by spring is :" + college);

	}

}
