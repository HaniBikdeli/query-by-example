package com.hanibikdeli.querybyexample.p01;

import org.springframework.data.domain.Example;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PersonController {

    public PersonController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    private final PersonRepository personRepository;

    @PostMapping("/list")
    public List<Person> list(@RequestBody Person person){
        Example<Person> personExample = Example.of(person);
        return this.personRepository.findAll(personExample);
    }
}


