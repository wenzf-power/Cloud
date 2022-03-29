package com.wzf.jpa.service.mapper;

import com.wzf.jpa.entity.secondary.Student;
import com.wzf.jpa.service.dto.StudentDTO;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

/**
 * StudentMapper
 *
 */
@Service
public class StudentMapper {

    public Student convertToStudent(StudentDTO dto) {
        Student student = new Student();
        BeanUtils.copyProperties(dto, student);
        return student;
    }

    public StudentDTO convertForStudent(Student student) {
        StudentDTO dto = new StudentDTO();
        BeanUtils.copyProperties(student, dto);
        return dto;
    }
}
