package com.example.demo.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity
@Table(name = "students")
public class Student {
    @Id
    @Column(name="id")
    int studentId;

    @Column(name="name")
    String studentName;
    @Column(name="dept")
    String studentDept;
}

