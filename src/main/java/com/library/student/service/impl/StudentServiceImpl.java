package com.library.student.service.impl;

import com.library.student.model.entity.Student;
import com.library.student.repository.StudentRepository;
import com.library.student.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;


    @Transactional(readOnly = true)
    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Transactional
    @Override
    public Student saveOrUpdate(Student student) {
        return studentRepository.save(student);
    }

    @Transactional
    @Override
    public void deleteById(Long id) {
        studentRepository.deleteById(id);

    }
}
