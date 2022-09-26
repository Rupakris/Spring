package com.example.demo.controllers;

import com.example.demo.models.Student;
import com.example.demo.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BaseController {
    @Autowired
    StudentRepository studentRepository;

    @GetMapping
    public List<Student> getController() {
        Student s1 = new Student();
//        Student s2 = new Student();

        return studentRepository.findAll();
    }

    @GetMapping("/save")
    public Student saveController(@RequestParam("id") int id, @RequestParam("name") String name, @RequestParam("Dept") String dept) {
        Student s1 = new Student(id, name, dept);
//        Student s2 = new Student();

        return studentRepository.save(s1);
    }
//    @GetMapping
//    public String getController3()
//    {
//        return "hello ralphin";
//    }

    @GetMapping("/ralphin/{var}")
    public String getController2(@PathVariable String var, @RequestParam("name") String var1) {
        return "bye " + var + var1;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public String postController(@RequestBody Student s3) {
        System.out.println("Name: " + s3.getStudentName() + "Dept: " + s3.getStudentDept());
//        if(s3.getStudentDept() != "CSE") {
//            throw new RuntimeException();
//        }

        return "OK";
    }


}

