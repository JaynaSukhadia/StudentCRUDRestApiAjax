package com.aurosoft.studentRestApi.service;

import com.aurosoft.studentRestApi.entity.Student;

import java.util.List;

public interface StudentService {

    List<Student> getAllStudents();
    Student getStudentById(int id);

    Student insertStudent(Student student);

    Student updateStudent(Student student);

    int deleteStudent(int id);


}
