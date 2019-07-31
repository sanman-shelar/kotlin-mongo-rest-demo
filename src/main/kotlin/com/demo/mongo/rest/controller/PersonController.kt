package com.demo.mongo.rest.controller

import com.demo.mongo.rest.model.Person
import com.demo.mongo.rest.repo.PersonRepository
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/app/employee")
class PersonController(private val personRepository: PersonRepository) {

    @GetMapping
    fun getPersons(pageable: Pageable): Page<Person> = personRepository.findAll(pageable)

    @GetMapping("/firstName")
    fun getPersonByFirstName(@RequestParam("value") firstName: String): ResponseEntity<List<Person>> =
            ResponseEntity(personRepository.getPersonByFirstName(firstName), HttpStatus.OK)

    @PostMapping
    fun postPerson(@RequestBody person: Person): ResponseEntity<Person> {
        personRepository.save(person)
        return ResponseEntity(person, HttpStatus.CREATED)
    }

    @DeleteMapping("{id}")
    fun deletePerson(@PathVariable id : String) : ResponseEntity<String>{
        personRepository.deleteById(id)
        return ResponseEntity("", HttpStatus.NO_CONTENT)
    }
}