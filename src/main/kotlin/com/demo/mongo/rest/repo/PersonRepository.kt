package com.demo.mongo.rest.repo

import com.demo.mongo.rest.model.Person
import org.springframework.data.mongodb.repository.MongoRepository

interface PersonRepository : MongoRepository<Person, String> {

    fun getPersonByFirstName(firstName: String) : List<Person>

}