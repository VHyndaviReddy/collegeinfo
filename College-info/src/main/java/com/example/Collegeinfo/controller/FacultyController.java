package com.example.Collegeinfo.controller;

import com.example.Collegeinfo.model.Faculty;
import com.example.Collegeinfo.service.FacultyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/faculties")
public class FacultyController {
    @Autowired
    private FacultyService facultyService;

    @PostMapping
    public ResponseEntity<Faculty> addFaculty(@RequestBody Faculty faculty) {
        Faculty savedFaculty = facultyService.addFaculty(faculty);
        return ResponseEntity.ok(savedFaculty);
    }

    @GetMapping("/college/{collegeName}")
    public ResponseEntity<List<Faculty>> getFacultiesByCollegeName(@PathVariable String collegeName) {
        List<Faculty> faculties = facultyService.getFacultiesByCollegeName(collegeName);
        return ResponseEntity.ok(faculties);
    }

    @GetMapping("/department/{departmentName}")
    public ResponseEntity<List<Faculty>> getFacultiesByDepartmentName(@PathVariable String departmentName) {
        List<Faculty> faculties = facultyService.getFacultiesByDepartmentName(departmentName);
        return ResponseEntity.ok(faculties);
    }

}
