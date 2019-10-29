package webtest;

import controller.WebTestController;
import model.PersonEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
@SpringBootApplication(scanBasePackageClasses = {WebTestController.class})
public class WebTest001 {

	private static final Logger log = LoggerFactory.getLogger(WebTest001.class);


	public static void main(String[] args) {
		System.out.println("Let's WebTest!!!!---------STRAT");
		SpringApplication.run(WebTest001.class, args);
		System.out.println("Let's WebTest!!!!-----END");
	}

//	@Bean
//	public RestTemplate restTemplate(RestTemplateBuilder builder) {
//		return builder.build();
//	}
//
//	@Bean
//	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
//		return args -> {
//			PersonEntity personEntity = restTemplate.getForObject(
//					"http://127.0.0.1:8080/kiki/findall", PersonEntity.class);
//			System.out.println(personEntity.toString());
//
//		};
//	}
}


