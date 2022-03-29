package com.wzf.jpa.repository.secondary;

import com.wzf.jpa.entity.secondary.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * StudentRepository
 *
 **/
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
