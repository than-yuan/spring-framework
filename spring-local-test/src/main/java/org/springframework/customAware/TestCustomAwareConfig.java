package org.springframework.customAware;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.springframework.customAware.dto")
// 如何实现一个Aware接口
// 1.首先按照Spring的规范，我们自定义一个Aware接口,让Bean实现此接口。再实现一个BeanPostProcessor，由于Aware的注入都是在属性设置之后，init方法之前，也就是说在BPP的postProcessBefore过程中实现，
// ，在postProcessBefore时判断Bean是否实现了我们自定义的Aware接口，然后做我们需要的逻辑即可

// ignoreDependencyInterface的理解：
// 为什么要ignore这么多Aware接口？ignore的逻辑关系到autowire，因此我先猜测：
// 这些Aware接口应该是Spring只希望他们在BFPP中进行处理，而不在Autowired过程中进行，所以就有了这些ignore逻辑。这可能和Spring的设计理念有关系
public class TestCustomAwareConfig {


}
