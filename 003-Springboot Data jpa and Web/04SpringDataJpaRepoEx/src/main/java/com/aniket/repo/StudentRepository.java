package com.aniket.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aniket.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
