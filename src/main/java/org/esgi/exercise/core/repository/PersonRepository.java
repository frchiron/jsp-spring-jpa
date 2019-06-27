package org.esgi.exercise.core.repository;

import javax.annotation.Resource;

import org.esgi.exercise.core.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

@Resource
public interface PersonRepository extends JpaRepository<Person, Integer> {
}
