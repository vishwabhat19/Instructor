package com.instructor.repository;

import org.springframework.data.repository.CrudRepository;

import com.instructor.entity.InstructorDetail;

public interface InstructorDetailRepository extends CrudRepository<InstructorDetail, Integer> {

}
