package com.sameer.zuul.example.studentservice.studentserviceexample;


import com.sameer.zuul.example.studentservice.studentserviceexample.domain.Student;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {

    @GetMapping(path = "/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Student getStudentDetails(@PathVariable String name) {
        return new Student(name, "5800 somewhere", "2");
    }


}
