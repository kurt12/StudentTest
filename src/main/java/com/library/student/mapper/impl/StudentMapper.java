package com.library.student.mapper.impl;

import com.library.student.mapper.Mapper;
import com.library.student.model.dto.StudentDTO;
import com.library.student.model.entity.Student;

public class StudentMapper implements Mapper<Student,StudentDTO> {

    @Override
    public Student toModel(StudentDTO studentDTO) {
        return null;
    }

    @Override
    public StudentDTO toDTO(Student student) {
        return null;
    }
}
