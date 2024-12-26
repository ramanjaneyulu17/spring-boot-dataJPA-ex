package com.example.spring_boot_dataJpa_ex.repository;

import com.example.spring_boot_dataJpa_ex.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer> {
   // List<Student> findByGrade(char grade);


    // List<Student> findByScoreGreaterThan(int i);

//List<Student> findByName(String name);
}
