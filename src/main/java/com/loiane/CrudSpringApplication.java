package com.loiane;

import com.loiane.model.Course;
import com.loiane.repository.CourseRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudSpringApplication.class, args);
	}

	CommandLineRunner initDatabase(CourseRepository courseRepository) {
		return args -> {
			courseRepository.deleteAll();

			Course course1 = new Course(1L,"Java EE", "Java EE");

			courseRepository.save(course1);
		};
	}
}
