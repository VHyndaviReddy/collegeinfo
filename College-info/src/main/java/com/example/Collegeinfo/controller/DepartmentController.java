package com.example.Collegeinfo.controller;

import com.example.Collegeinfo.model.College;
import com.example.Collegeinfo.model.Department;
import com.example.Collegeinfo.service.CollegeService;
import com.example.Collegeinfo.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
// Assuming you have CollegeService and DepartmentService classes for managing colleges and departments

// Inject CollegeService and DepartmentService into your controller or wherever you are handling the creation of departments

@RestController
@RequestMapping("/api/departments")
public class DepartmentController {

    @Autowired
    private CollegeService collegeService;

    @Autowired
    private DepartmentService departmentService;



        @PostMapping
        public ResponseEntity<Department> addDepartment(@RequestBody Department department) {
            Department savedDepartment = departmentService.addDepartment(department);
            return ResponseEntity.ok(savedDepartment);
        }

        @GetMapping("/college/{collegeName}")
        public ResponseEntity<
                List<Department>> getDepartmentsByCollegeName(@PathVariable String collegeName) {
            List<Department> departments = departmentService.getDepartmentsByCollegeName(collegeName);
            return ResponseEntity.ok(departments);

    }

}


