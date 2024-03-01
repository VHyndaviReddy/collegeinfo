package com.example.Collegeinfo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class College {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name", columnDefinition = "VARCHAR(255)")
    private String name;

    @Column(name = "address", columnDefinition = "VARCHAR(255)")
    private String address;

    @OneToMany(mappedBy = "college", cascade = CascadeType.ALL)
    private List<Department> departments;
    @OneToMany(mappedBy = "college", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Faculty> faculties;
    public College(String name) {
        this.name = name;
    }
}


