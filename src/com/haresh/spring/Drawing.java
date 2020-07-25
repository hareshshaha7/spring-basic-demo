package com.haresh.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class Drawing {

	public static void main(String[] args) {
//		Traditional way
//		Triangle triangle = new Triangle();
//		triangle.draw();
		
//		Spring way using BeanFactory
//		@SuppressWarnings("deprecation")
//		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("src/spring.xml"));
//		Triangle triangle = (Triangle)factory.getBean("triangle");
//		triangle.draw();

//		Spring way using BeanFactory
		@SuppressWarnings("deprecation")
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Triangle triangle = (Triangle)context.getBean("triangle");
		triangle.draw();
		
		System.out.println();
		Triangle triangle1 = (Triangle)context.getBean("triangle1");
		triangle1.draw();

	}

}
