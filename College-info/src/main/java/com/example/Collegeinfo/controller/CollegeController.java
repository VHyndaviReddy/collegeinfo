package com.example.Collegeinfo.controller;

import com.example.Collegeinfo.model.College;
import com.example.Collegeinfo.service.CollegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/colleges")
public class CollegeController {
    @Autowired
    private CollegeService collegeService;

    @PostMapping
    public ResponseEntity<College> addCollege(@RequestBody College college) {
        College savedCollege = collegeService.addCollege(college);
        return ResponseEntity.ok(savedCollege);
    }

    @GetMapping
    public ResponseEntity<List<College>> getAllColleges() {
        List<College> colleges = collegeService.getAllColleges();
        return ResponseEntity.ok(colleges);
    }

    @GetMapping("/{id}")
    public ResponseEntity<College> getCollegeById(@PathVariable int id) {
        College college = collegeService.getCollegeById(id);
        return ResponseEntity.ok(college);
    }

    @GetMapping("/name/{name}")
    public ResponseEntity<College> getCollegeByName(@PathVariable String name) {
        College college = collegeService.getCollegeByName(name);
        return ResponseEntity.ok(college);
    }

    @PutMapping("/{id}")
    public ResponseEntity<College> updateCollegeName(@PathVariable int id, @RequestParam String newName) {
        College updatedCollege = collegeService.updateCollegeName(id, newName);
        return ResponseEntity.ok(updatedCollege);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCollegeById(@PathVariable int id) {
        collegeService.deleteCollegeById(id);
        return ResponseEntity.ok().build();
    }
}

