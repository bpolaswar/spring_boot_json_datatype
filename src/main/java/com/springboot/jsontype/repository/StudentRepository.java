package com.springboot.jsontype.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.jsontype.entity.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
