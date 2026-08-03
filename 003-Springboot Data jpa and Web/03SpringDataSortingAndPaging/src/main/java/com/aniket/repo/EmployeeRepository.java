package com.aniket.repo;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.aniket.entity.Employee;

public interface EmployeeRepository extends
PagingAndSortingRepository<Employee, Integer>,
org.springframework.data.repository.CrudRepository<Employee, Integer> {

}