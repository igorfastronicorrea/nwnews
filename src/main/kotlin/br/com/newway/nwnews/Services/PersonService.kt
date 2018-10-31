package br.com.newway.nwnews.Services

import br.com.newway.nwnews.Models.Person
import br.com.newway.nwnews.Repositories.PersonRepository
import org.springframework.stereotype.Service
import javax.validation.Valid

@Service("PersonServices")
class PersonService(val personRepository: PersonRepository){

    fun save(@Valid person: Person): Person{
        val person = Person(
                person.name,
                person.birthday,
                person.squad,
                person.picture,
                person.qrCode
        )

        return personRepository.save(person)
    }
}