package com.JPAJoin.ManyToMany.ManyToMany.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Set;

@Entity
public class Subject {

    @Id
    Integer subject_id;
    String subject_name;

    @ManyToMany(mappedBy = "subjects")
    Set<Student> students;


    public Integer getSubject_id() {
        return subject_id;
    }

    public void setSubject_id(Integer subject_id) {
        this.subject_id = subject_id;
    }

    public String getSubject_name() {
        return subject_name;
    }

    public void setSubject_name(String subject_name) {
        this.subject_name = subject_name;
    }



}