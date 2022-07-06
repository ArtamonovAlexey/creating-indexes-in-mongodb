package ru.artamonov.creatingindexesinmongo.controller;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.artamonov.creatingindexesinmongo.model.Person;
import ru.artamonov.creatingindexesinmongo.service.PersonService;

@RestController
@RequestMapping("/people")
public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PutMapping("/save")
    public void save(@RequestBody Person person) {
        personService.savePerson(person);
    }
}
