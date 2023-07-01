package com.aurosoft.studentRestApi.repository;

import com.aurosoft.studentRestApi.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository <Student, Integer>{

}
