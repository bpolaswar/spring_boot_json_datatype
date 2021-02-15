package com.springboot.jsontype.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.springboot.jsontype.entity.Student;
import com.springboot.jsontype.graphqlmodels.StudentInput;
import com.springboot.jsontype.repository.StudentRepository;

@Service
public class StudentService {
	private StudentRepository studentRepository;

	public StudentService(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	public List<Student> allStudents() {
		return studentRepository.findAll();
	}
	
	public Student getStudent(Long id) {
		return studentRepository.findById(id).get();
	}

	public Student insertStudent(StudentInput studentInput) throws JsonProcessingException {
		if (null != studentInput.getJson()) {
			ObjectMapper mapper = new ObjectMapper();
			String json = mapper.writeValueAsString(studentInput.getJson());
			System.out.println("jsonStr: " + json);
			// String jsonStr = studentInput.getJson().toString();
			Student student = Student.builder().data(json).build();
			return studentRepository.save(student);
		} else {
			Student student = Student.builder().build();
			return student;
		}
	}
}
