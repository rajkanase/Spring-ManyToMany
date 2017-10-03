package com.JPAJoin.ManyToMany.ManyToMany.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Student {

    @Id
    Integer student_id;
    String student_name;
    String student_city;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "student_subject", joinColumns = @JoinColumn(name = "std_id", referencedColumnName = "student_id"),inverseJoinColumns = @JoinColumn(name = "sub_id",referencedColumnName = "subject_id"))
    Set<Subject> subjects;

    public Set<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(Set<Subject> subjects) {
        this.subjects = subjects;
    }





    @Override
    public String toString() {
        return "Student{" +
                "student_id=" + student_id +
                ", student_name='" + student_name + '\'' +
                ", student_city='" + student_city + '\'' +
                '}';
    }



    public Integer getStudent_id() {
        return student_id;
    }

    public void setStudent_id(Integer student_id) {
        this.student_id = student_id;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public String getStudent_city() {
        return student_city;
    }

    public void setStudent_city(String student_city) {
        this.student_city = student_city;
    }


}