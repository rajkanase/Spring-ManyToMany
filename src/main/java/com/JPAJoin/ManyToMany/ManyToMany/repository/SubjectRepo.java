package com.JPAJoin.ManyToMany.ManyToMany.repository;

import com.JPAJoin.ManyToMany.ManyToMany.model.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectRepo extends JpaRepository<Subject,Integer> {
}
