package com.instructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.instructor.entity.Instructor;
import com.instructor.entity.InstructorDetail;
import com.instructor.repository.InstructorDetailRepository;
import com.instructor.repository.InstructorRepository;

@SpringBootApplication
public class InstructorApplication implements CommandLineRunner {

	@Autowired
	InstructorRepository instructorRepository;
	
	@Autowired
	InstructorDetailRepository detailRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(InstructorApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
			Instructor instructor = new Instructor("Vishwa","Bhat","vishwa@gmail.com");
			
			
			InstructorDetail instructorDetail = new InstructorDetail("http://yolo","no hobbies");
			
			instructor.setInstructorDetail(instructorDetail);
			
			instructorRepository.save(instructor);
			
			instructorRepository.delete(instructor);
			
		
	}
}
