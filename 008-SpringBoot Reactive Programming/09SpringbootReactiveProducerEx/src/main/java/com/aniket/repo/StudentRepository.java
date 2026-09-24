package com.aniket.repo;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.aniket.entity.Student;

public interface StudentRepository extends ReactiveMongoRepository<Student, String> {

}
