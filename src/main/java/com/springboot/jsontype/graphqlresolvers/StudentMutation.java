package com.springboot.jsontype.graphqlresolvers;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.springboot.jsontype.entity.Student;
import com.springboot.jsontype.graphqlmodels.StudentInput;
import com.springboot.jsontype.service.StudentService;

import graphql.kickstart.tools.GraphQLMutationResolver;

@Component
public class StudentMutation implements GraphQLMutationResolver {
	private StudentService studentService;

	public StudentMutation(StudentService studentService) {
		super();
		this.studentService = studentService;
	}

	public Student insertStudent(StudentInput studentInput) throws JsonProcessingException {
		return studentService.insertStudent(studentInput);
	}
}
