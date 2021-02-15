package com.springboot.jsontype.graphqlresolvers;

import java.util.List;

import org.springframework.stereotype.Component;

import com.springboot.jsontype.entity.Student;
import com.springboot.jsontype.service.StudentService;

import graphql.kickstart.tools.GraphQLQueryResolver;

@Component
public class StudentQuery implements GraphQLQueryResolver {
	private StudentService studentService;

	public StudentQuery(StudentService studentService) {
		super();
		this.studentService = studentService;
	}

	public List<Student> getAllStudents() {
		return studentService.allStudents();
	}
	
	public Student getStudentById(Long id) {
		return studentService.getStudent(id);
	}
}
