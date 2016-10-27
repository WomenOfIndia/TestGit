package com.java.DIConstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
  Employee e=(Employee)context.getBean("e");
  Employee e=(Employee)context.getBean("e1");
  Employee e=(Employee)context.getBean("e2");
  
  e.show();
	}

}
