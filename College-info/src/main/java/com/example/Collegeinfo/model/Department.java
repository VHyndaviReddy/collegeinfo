package com.example.Collegeinfo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
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

public class Department {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String name;

        @ManyToOne
        @JoinColumn(name = "college_id")
        @JsonIgnore
        private College college;
        @OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
        private List<Faculty> faculties;
        @OneToOne(mappedBy = "department")
        private Faculty hod;


    }


