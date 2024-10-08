package test.com.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class TestComponent {
	
	@Autowired
	UserComponent userCom;
	
	public TestComponent() {
		log.info("TestComponent()...");
		log.info("UserCom:{}", userCom);
	}

}
