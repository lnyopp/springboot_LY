package com.tts.h2explorer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.tts.h2explorer.domain.Customer;
import com.tts.h2explorer.repository.CustomerRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	private static final Logger log = LoggerFactory.getLogger(DemoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(CustomerRepository repository) {
		return (args) -> {
			repository.save(new Customer("Rickey", "McTester","lnetopp@gmail.com","message"));
		

			log.info("Customer's added to table");
			log.info("=========================");
			for (Customer customer : repository.findAll()) {
				log.info(customer.toString());
			}

			log.info("");

			repository.findById(1L).ifPresent(customer -> {
				log.info("Customer found using findById");
				log.info("=============================");
				log.info(customer.toString());
				log.info("");
			});

			log.info("Customer found using findByLastName");
			log.info("===================================");
			repository.findByLastName("Rodgers").forEach(item -> {
				log.info(item.toString());
			});

			log.info("The end");
		};
	}
}
