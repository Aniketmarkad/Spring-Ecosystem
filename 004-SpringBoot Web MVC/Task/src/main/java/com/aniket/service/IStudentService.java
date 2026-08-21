package com.aniket.service;

import java.util.List;

import com.aniket.entity.StudentEntity;

public interface IStudentService {
	
	Integer saveStudent (StudentEntity s);
	
	void updateStudent(StudentEntity s);
	
	void deleteStudent(Integer id);
	
	StudentEntity getOneStudent(Integer id);
			
	
	List<StudentEntity> getAllStudents();
	
	

}
