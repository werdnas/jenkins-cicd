package com.techspeaks.studentkubernetesdemo.repository;

import com.techspeaks.studentkubernetesdemo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
}