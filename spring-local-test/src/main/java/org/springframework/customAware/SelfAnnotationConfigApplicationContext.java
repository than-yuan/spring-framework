package org.springframework.customAware;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SelfAnnotationConfigApplicationContext extends AnnotationConfigApplicationContext {
	@Override
	protected void prepareBeanFactory(ConfigurableListableBeanFactory beanFactory) {
		super.prepareBeanFactory(beanFactory);
		beanFactory.addBeanPostProcessor(new DateAwareProcessor());
	}

	public SelfAnnotationConfigApplicationContext() {
	}

	public SelfAnnotationConfigApplicationContext(DefaultListableBeanFactory beanFactory) {
		super(beanFactory);
	}

	public SelfAnnotationConfigApplicationContext(Class<?>... componentClasses) {
		super(componentClasses);
	}

	public SelfAnnotationConfigApplicationContext(String... basePackages) {
		super(basePackages);
	}
}
