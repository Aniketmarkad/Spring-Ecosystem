package com.aniket.service.impl;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aniket.entity.StudentEntity;
import com.aniket.exception.StudentNotFoundException;
import com.aniket.repo.StudentRepository;
import com.aniket.service.IStudentService;

@Service
public class StudentServiceImpl implements IStudentService {

	@Autowired
	private StudentRepository repo;
	
	@Override
	public Integer saveStudent(StudentEntity s) {
		s =repo.save( s);
		return s.getSid();
	}

	@Override
	public void updateStudent(StudentEntity s) {
		repo.save(s);

	}

	@Override
	public void deleteStudent(Integer id) {
		//repo.deleteById(id);
		
		Optional<StudentEntity>opt = repo.findById(id);
		if(opt.isPresent())
		{
			repo.delete(opt.get());
		}else {
			throw new StudentNotFoundException("Student " +id+ " NOT FOUND"); 
		}

	}

	@Override
	public StudentEntity getOneStudent(Integer id) {
		//Optional<StudentEntity> opt= repo.findById(id);
		//return opt.get();
		
		Optional<StudentEntity>opt = repo.findById(id);
		if(opt.isPresent())
		{
			return opt.get();
			
		}else {
			throw new StudentNotFoundException("Student " +id+ " NOT FOUND"); 
		}
	}

	@Override
	public List<StudentEntity> getAllStudents() {
	     List<StudentEntity> list = repo.findAll();
		return list;
	} 

}
