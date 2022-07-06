package ru.artamonov.creatingindexesinmongo.service;

import org.springframework.stereotype.Service;
import ru.artamonov.creatingindexesinmongo.model.Person;
import ru.artamonov.creatingindexesinmongo.repository.PersonRepository;

@Service
public class PersonService {

    private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public void savePerson(Person person) {
        personRepository.save(person);
    }
}
