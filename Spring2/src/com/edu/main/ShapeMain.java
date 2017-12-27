package com.edu.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.edu.entity.Shape;


public class ShapeMain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Shape sh1=(Shape)context.getBean("rectangle");
		sh1.viewSize();
		Shape sh2=(Shape)context.getBean("triangle");
		sh2.viewSize();
	}
}
