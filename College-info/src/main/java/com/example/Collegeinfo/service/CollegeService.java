package com.example.Collegeinfo.service;

import com.example.Collegeinfo.model.College;
import com.example.Collegeinfo.repository.collegerepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CollegeService {
    @Autowired
    private collegerepository repo;
    public College addCollege(College college) {
        return repo.save(college);
    }

    public List<College> getAllColleges() {
        return repo.findAll();
    }

    public College getCollegeById(int id) {
        return repo.findById(id).orElse(null);
    }

    public College getCollegeByName(String name) {
        return repo.findByName(name);
    }

    public College updateCollegeName(int id, String newName) {
        return repo.findById(id).map(college -> {
            college.setName(newName);
            return repo.save(college);
        }).orElse(null);
    }

    public void deleteCollegeById(int id) {
        repo.deleteById(id);
    }
}
