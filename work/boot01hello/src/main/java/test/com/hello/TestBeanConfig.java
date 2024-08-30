package test.com.hello;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestBeanConfig {
	
	@Bean
	public TestBean testBean() {
		return new TestBean();
	}
	
	@Bean
	public Person Person() {
		Person p = new Person();
		p.setName("kim");
		p.setAge(33);
		return p;
	}

}
