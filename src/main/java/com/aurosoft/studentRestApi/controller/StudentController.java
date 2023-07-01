package com.aurosoft.studentRestApi.controller;


import com.aurosoft.studentRestApi.entity.Student;
import com.aurosoft.studentRestApi.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class StudentController {
    @Autowired
    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("studentList")
    public ResponseEntity<List<Student>> getAllStudents()
    {

        return new  ResponseEntity<List<Student>>(studentService.getAllStudents(), HttpStatus.OK);
    }

    @GetMapping("/student/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable int id)
    {
        return new ResponseEntity<Student>(studentService.getStudentById(id), HttpStatus.OK);
    }


    @PostMapping("/student/insert")
    public ResponseEntity<Void> insertStudent(@RequestBody Student student) {
        studentService.insertStudent(student);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @PostMapping("/student/update")
    public ResponseEntity<Void> updateStudent(@RequestBody Student student) {
        studentService.updateStudent(student);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @DeleteMapping("/student/delete/{id}")
    public ResponseEntity<Void> deleteStudent(@PathVariable int id)
    {
        studentService.deleteStudent(id);
        return  new ResponseEntity<Void>(HttpStatus.OK);
    }



}
