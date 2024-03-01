package com.example.Collegeinfo.repository;

import com.example.Collegeinfo.model.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface facultyrepository extends JpaRepository<Faculty,Integer> {
    List<Faculty> findByCollegeName(String collegeName);

    List<Faculty> findByDepartmentName(String departmentName);
}
