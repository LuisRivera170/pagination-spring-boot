package com.example.pagination;

import com.example.pagination.model.User;
import com.example.pagination.repository.UserRepository;
import com.example.pagination.utils.Beans;
import com.github.javafaker.Faker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PaginationApplication implements CommandLineRunner {

	private static final Logger logger = LoggerFactory.getLogger(PaginationApplication.class);

	@Autowired
	UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(PaginationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("Loading data");
		for (int i = 0; i < 100; i++) {
			userRepository.save(getNewUser());
		}
		logger.info("Data loaded");
	}

	public User getNewUser() {
		Faker faker = Beans.faker();
		User user = new User();

		user.setName(faker.name().firstName());
		user.setLastName(faker.name().lastName());
		user.setUserName(faker.name().username());
		user.setPhoneNumber(faker.phoneNumber().phoneNumber());
		user.setCellPhoneNumber(faker.phoneNumber().cellPhone());
		user.setBirthDay(faker.date().birthday());
		user.setBloodGroup(faker.name().bloodGroup());

		return user;
	}
}
