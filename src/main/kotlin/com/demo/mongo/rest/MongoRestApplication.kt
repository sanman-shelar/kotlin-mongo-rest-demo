package com.demo.mongo.rest

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MongoRestApplication

fun main(args: Array<String>) {
    runApplication<MongoRestApplication>(*args)
}
