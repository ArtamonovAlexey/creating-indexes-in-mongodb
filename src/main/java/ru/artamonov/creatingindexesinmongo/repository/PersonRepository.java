package ru.artamonov.creatingindexesinmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import ru.artamonov.creatingindexesinmongo.model.Person;

@Repository
public interface PersonRepository extends MongoRepository<Person, Long> {

    Person save(Person Person);

}
