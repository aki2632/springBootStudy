package test.com.hello;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
public class Person {
	
	public Person() {
		log.info("Person()...");
	}
	
	private String name;
	private int age;

}
