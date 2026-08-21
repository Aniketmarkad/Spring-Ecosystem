package com.aniket.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aniket.entity.StudentEntity;

public interface StudentRepository extends JpaRepository<StudentEntity, Integer> {

}
