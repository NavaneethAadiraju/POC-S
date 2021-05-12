package com.ojas.app.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ojas.app.model.Person;

public interface PersonDao extends MongoRepository<Person, Integer> {

}
