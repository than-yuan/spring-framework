package org.springframework.customerEditor;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.factory.config.CustomEditorConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.springframework.customerEditor.dto")
public class TestCustomerEditorConfig {

	// 自定义属性Editor的方法
	 // 1.首先创建一个Editor继承PropertyEditorSupport
	// 将这个Editor放入容器中，两种办法，1是直接将Editor放入CustomEditor中，2是先把Editor放入一个EditorRegistrar中，再将这个EditorRegistrar放入容器中，
	@Bean
	public CustomEditorConfigurer customerEditorConfigurer(){
		CustomEditorConfigurer customerEditorConfigurer = new CustomEditorConfigurer();
		customerEditorConfigurer.setPropertyEditorRegistrars(new PropertyEditorRegistrar[]{new SelfEditorRegistrar()});
		return customerEditorConfigurer;
	}
}
