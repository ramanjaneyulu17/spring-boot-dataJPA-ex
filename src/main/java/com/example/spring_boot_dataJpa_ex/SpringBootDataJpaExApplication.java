package com.example.spring_boot_dataJpa_ex;

import com.example.spring_boot_dataJpa_ex.model.Student;
import com.example.spring_boot_dataJpa_ex.repository.StudentRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Optional;

@SpringBootApplication
public class SpringBootDataJpaExApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootDataJpaExApplication.class, args);

		Student s1=context.getBean(Student.class);
		Student s2=context.getBean(Student.class);
		Student s3=context.getBean(Student.class);

		StudentRepo sr=context.getBean(StudentRepo.class);

		System.out.println(sr.findByScoreGreaterThan(70));

		//System.out.println(sr.findByGrade('B'));

//		Optional<Student> s=sr.findById(102);
//		System.out.println(s.orElse(new Student()));


//		s1.setRollNo(101);
//		s1.setName("Ram");
//		s1.setScore(45);
//		s1.setPassed(true);
//		s1.setGrade('D');
//
//		s2.setRollNo(102);
//		s2.setName("Ramz");
//		s2.setScore(80);
//		s2.setPassed(true);
//		s2.setGrade('B');
//
//		s3.setRollNo(103);
//		s3.setName("Pant");
//		s3.setScore(89);
//		s3.setPassed(true);
//		s3.setGrade('B');
//
//		sr.save(s1);
//		sr.save(s2);
//		sr.save(s3);
	}

}
