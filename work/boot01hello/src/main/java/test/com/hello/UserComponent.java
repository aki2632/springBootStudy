package test.com.hello;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@ConfigurationProperties("user")
@Slf4j
@Component
public class UserComponent {
	
	private String user_name;
	private int user_age;
	
	public UserComponent() {
		log.info("UserComponent()...");
		log.info("user_name:{}", user_name);
		log.info("user_age:{}", user_age);
	}

}
