package com.aniket.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aniket.entity.Student;
import com.aniket.exception.StudentNotFoundException;
import com.aniket.repo.StudentRepository;
import com.aniket.service.IStudentService;

@Service
public class StudentServiceImpl implements IStudentService {

	@Autowired
	private StudentRepository repo;
	
	
	@Override
	public Integer saveStudent(Student s) {
		
		s=repo.save(s);
		return s.getStdId();
	}

	@Override
	public void updateStudent(Student s)
	{
		if(s.getStdId() == null || !repo.existsById(s.getStdId()))
			throw new StudentNotFoundException("STUDENT "+s.getStdId()+ " NOT EXIST");
		else
			repo.save(s);
					
	}

	@Override
	public void deleteStudent(Integer id) {
		repo.delete(getOneStudent(id));
	}

	@Override
	public Student getOneStudent(Integer id) {
		return repo.findById(id)
				.orElseThrow(
						()->new StudentNotFoundException("STUDENT '"+id+"' NOT EXIST")
						);
		
	}

	@Override
	public List<Student> getAllStudents() {
		
		List<Student> list = repo.findAll();
		return list;
	}

}
