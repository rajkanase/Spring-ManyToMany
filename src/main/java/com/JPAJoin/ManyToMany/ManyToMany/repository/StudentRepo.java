package com.JPAJoin.ManyToMany.ManyToMany.repository;

//import org.hibernate.boot.spi.JpaOrmXmlPersistenceUnitDefaultAware;
import com.JPAJoin.ManyToMany.ManyToMany.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer> {
}
