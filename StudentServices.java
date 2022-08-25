package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentServices {
	
	@Autowired
    private StudentRepository repo;
public Iterable<Student> listAll() {
        return this.repo.findAll();
    }
//saving a specific record by using the method save() of CrudRepository  
public void saveOrUpdate(Student students)  
{  
repo.save(students);  
}
public Student getStudentById(long id)  
{  
return repo.findById(id).get();  
}
public void update(Student students, int id)  
{  
repo.save(students);  
}  
 
public void delete(long id)  
{  
repo.deleteById(id);  
}  
  
}


