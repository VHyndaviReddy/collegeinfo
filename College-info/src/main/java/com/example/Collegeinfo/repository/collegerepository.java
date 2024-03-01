package com.example.Collegeinfo.repository;

import com.example.Collegeinfo.model.College;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface collegerepository extends JpaRepository<College,Integer> {
    College findByName(String name);
}
