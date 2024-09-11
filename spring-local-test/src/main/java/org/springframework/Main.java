package org.springframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.customerEditor.TestCustomerEditorConfig;
import org.springframework.dto.Person;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TestCustomerEditorConfig.class);
		Person person = context.getBean(Person.class);
		System.out.println(person.getFamilyInfo().toString());
	}
}