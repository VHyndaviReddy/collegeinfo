package com.example.Collegeinfo.service;

import com.example.Collegeinfo.model.Faculty;
import com.example.Collegeinfo.repository.facultyrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FacultyService {
    @Autowired
    private facultyrepository frepo;
    public Faculty addFaculty(Faculty faculty) {
        return frepo.save(faculty);
    }

    public List<Faculty> getFacultiesByCollegeName(String collegeName) {
        return frepo.findByCollegeName(collegeName);
    }

    public List<Faculty> getFacultiesByDepartmentName(String departmentName) {
        return frepo.findByDepartmentName(departmentName);
    }
}
