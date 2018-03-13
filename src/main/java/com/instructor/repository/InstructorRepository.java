package com.instructor.repository;

import org.springframework.data.repository.CrudRepository;

import com.instructor.entity.Instructor;

public interface InstructorRepository extends CrudRepository<Instructor, Integer> {

}
