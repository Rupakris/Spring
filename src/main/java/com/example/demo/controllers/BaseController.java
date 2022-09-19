package com.example.demo.controllers;

import com.example.demo.models.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class BaseController {
    @GetMapping
    public ResponseEntity<Student> getController()
    {
        Student s1 = new Student();
//        Student s2 = new Student();
        return ResponseEntity.ok(s1);
    }
//    @GetMapping
//    public String getController3()
//    {
//        return "hello ralphin";
//    }

    @GetMapping("/ralphin/{var}")
    public String getController2(@PathVariable String var, @RequestParam("name") String var1 )
    {
        return "bye "+ var+var1;
    }
    @PostMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public String postController(@RequestBody Student s3)
    {
        System.out.println("Name: "+ s3.getStudentName()+"Dept: "+s3.getStudentDept());
//        if(s3.getStudentDept() != "CSE") {
//            throw new RuntimeException();
//        }

        return "OK";
    }


}

