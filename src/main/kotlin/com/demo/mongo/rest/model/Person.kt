package com.demo.mongo.rest.model

import org.bson.types.ObjectId
import org.springframework.data.mongodb.core.mapping.Document

@Document(value = "employee_master")
data class Person(
        val _id: String?,
        val firstName: String,
        val lastName: String,
        val salary: Double,
        val demographics: Demographics
)