package com.aniket.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aniket.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
