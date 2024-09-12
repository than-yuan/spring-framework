package org.springframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.customAware.SelfAnnotationConfigApplicationContext;
import org.springframework.customAware.TestCustomAwareConfig;
import org.springframework.customAware.dto.Schedule;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new SelfAnnotationConfigApplicationContext(TestCustomAwareConfig.class);
		Schedule bean = context.getBean(Schedule.class);
		System.out.println(bean.getInjectAwareDate());
	}
}