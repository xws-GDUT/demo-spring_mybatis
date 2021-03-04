package com.vsen.dao;

import com.vsen.pojo.Student;
import org.springframework.stereotype.Repository;

import java.util.List;
public interface StudentDao {
    List<Student> getAllStudents();
}
