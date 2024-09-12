package org.springframework.customAware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.util.Date;


public class DateAwareProcessor implements BeanPostProcessor {
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if (bean instanceof DateAware) {
			((DateAware) bean).setDate(new Date());
		}
		return bean;
	}
}
