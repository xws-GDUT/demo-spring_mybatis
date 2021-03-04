package com.vsen.service.impl;

import com.vsen.dao.StudentDao;
import com.vsen.pojo.Student;
import com.vsen.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service("studentServiceImpl")
public class StudentServiceImpl implements StudentService {
    @Resource(name="studentDao")
    private StudentDao studentDao;

    @Override
    public List<Student> getAllStudents() {
        return studentDao.getAllStudents();
    }
}
