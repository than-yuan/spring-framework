package org.springframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.customAware.SelfAnnotationConfigApplicationContext;
import org.springframework.customAware.TestCustomAwareConfig;
import org.springframework.customAware.dto.Schedule;
import org.springframework.customerEditor.TestCustomerEditorConfig;
import org.springframework.customerEditor.dto.Person;

public class Main {
	public static void main(String[] args) {
//		AnnotationConfigApplicationContext context = new SelfAnnotationConfigApplicationContext(TestCustomAwareConfig.class);
//		Schedule bean = context.getBean(Schedule.class);
//		System.out.println(bean.getInjectAwareDate());
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TestCustomerEditorConfig.class);
		Person bean = context.getBean(Person.class);
		System.out.println(bean.getFamilyInfo().toString());
	}
}