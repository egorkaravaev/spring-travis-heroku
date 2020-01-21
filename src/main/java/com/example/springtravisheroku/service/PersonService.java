package com.example.springtravisheroku.service;

import com.example.springtravisheroku.entity.Person;
import com.example.springtravisheroku.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    public PersonRepository personRepository;

    public void savePerson(String name) {
        Person person = new Person();
        person.setName(name);
        personRepository.save(person);
    }

    public String getAll() {
        StringBuilder builder = new StringBuilder();
        List<Person> persons = personRepository.findAll();
        for (Person person : persons) {
            builder.append(person.getId()).append(" - ").append(person.getName()).append("\n");
        }
        return builder.toString();
    }
}
