package com.pluralsight.first_spring_app;

import com.pluralsight.first_spring_app.model.Person;
import com.pluralsight.first_spring_app.repository.PersonDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class FirstSpringAppApplication {

	@Autowired
	static PersonDAO personDAO;

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(FirstSpringAppApplication.class, args);

		String[] beanNames = context.getBeanDefinitionNames();
		Arrays.sort(beanNames);

		// Print each bean name
		System.out.println("Beans provided by Spring Boot:");
		for (String beanName : beanNames) {
			System.out.println(beanName);
		}

//		PersonDAO personDAO = context.getBean(PersonDAO.class);
		Person person = personDAO.find();
		System.out.println(person);
	}

}
