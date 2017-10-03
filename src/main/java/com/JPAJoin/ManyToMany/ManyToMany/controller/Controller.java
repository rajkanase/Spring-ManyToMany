package com.JPAJoin.ManyToMany.ManyToMany.controller;

import com.JPAJoin.ManyToMany.ManyToMany.model.Student;
import com.JPAJoin.ManyToMany.ManyToMany.model.Subject;
import com.JPAJoin.ManyToMany.ManyToMany.repository.StudentRepo;
import com.JPAJoin.ManyToMany.ManyToMany.repository.SubjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    StudentRepo studentRepo;

    @Autowired
    SubjectRepo subjectRepo;

    @PostMapping(value = "/savemanytomany")
    String savemanytomany(@RequestBody Student student){
        studentRepo.save(student);
        subjectRepo.save(student.getSubjects());
        return "data inserted";

    }

    @PostMapping(value = "/savestudent")
    String savestudent(@RequestBody Student student){
        studentRepo.save(student);
        return "data inserted into student";

    }

    @PostMapping(value = "/savesubject")
    String savesubject(@RequestBody Subject subject){
        subjectRepo.save(subject);
        return "data inserted into subject";

    }
}
