package com.example.Collegeinfo.repository;

import com.example.Collegeinfo.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface departmentrepository extends JpaRepository<Department,Integer> {
    List<Department> findByCollegeName(String collegeName);


}

