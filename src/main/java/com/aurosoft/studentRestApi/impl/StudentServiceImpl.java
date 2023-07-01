package com.aurosoft.studentRestApi.impl;

import com.aurosoft.studentRestApi.entity.Student;
import com.aurosoft.studentRestApi.repository.StudentRepository;
import com.aurosoft.studentRestApi.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StudentServiceImpl implements StudentService {

    StudentRepository  studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student getStudentById(int id) {
        return studentRepository.findById(id).orElseThrow();
    }

    @Override
    public Student insertStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public int deleteStudent(int id) {
        studentRepository.deleteById(id);
        return id;
    }
}
