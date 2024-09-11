package org.springframework.customerEditor;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.factory.config.CustomEditorConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.springframework.dto")
public class TestCustomerEditorConfig {

	@Bean
	public CustomEditorConfigurer customerEditorConfigurer(){
		CustomEditorConfigurer customerEditorConfigurer = new CustomEditorConfigurer();
		customerEditorConfigurer.setPropertyEditorRegistrars(new PropertyEditorRegistrar[]{new SelfEditorRegistrar()});
		return customerEditorConfigurer;
	}
}
