package br.com.newway.nwnews.Controllers

import br.com.newway.nwnews.Models.Person
import br.com.newway.nwnews.Services.PersonService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/birthday")
class PersonController(val personService: PersonService){

    @PostMapping("/person")
    fun savePerson(person: Person): Person = personService.save(person)
}