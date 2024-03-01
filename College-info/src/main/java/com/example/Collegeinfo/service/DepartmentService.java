package com.example.Collegeinfo.service;

import com.example.Collegeinfo.model.Department;
import com.example.Collegeinfo.repository.departmentrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DepartmentService {
    @Autowired
    private departmentrepository drepo;
    public List<Department> getDepartmentsByCollegeName(String collegeName) {
        return drepo.findByCollegeName(collegeName);
    }

    public Department addDepartment(Department department) {
        return drepo.save(department);
    }



}
