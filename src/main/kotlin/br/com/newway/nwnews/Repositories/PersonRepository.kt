package br.com.newway.nwnews.Repositories

import br.com.newway.nwnews.Models.Person
import org.springframework.data.mongodb.repository.MongoRepository

interface PersonRepository : MongoRepository<Person, Birthday>