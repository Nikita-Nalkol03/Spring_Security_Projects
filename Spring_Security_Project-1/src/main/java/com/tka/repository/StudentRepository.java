package com.tka.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tka.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Integer> {

	



}
