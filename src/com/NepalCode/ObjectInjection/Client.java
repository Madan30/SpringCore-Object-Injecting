package com.NepalCode.ObjectInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {

		/*
		 * Student s = new Student(); MathCheat cheat = new MathCheat();
		 * s.setMathCheat(cheat); s.cheating();
		 */

		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		Student s1 = context.getBean("student", Student.class);
		s1.cheating();
		
		AnotherStudent as = context.getBean("anotherStudent", AnotherStudent.class);
		as.startCheating();
		

	}

}
