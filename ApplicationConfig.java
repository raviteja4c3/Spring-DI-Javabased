package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tpoint.*;

@Configuration
public class ApplicationConfig {

	@Bean
	public HelloWorld helloworld(){
		return new HelloWorld();
	}
}
