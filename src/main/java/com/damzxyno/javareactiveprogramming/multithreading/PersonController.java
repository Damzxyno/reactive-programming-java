package com.damzxyno.javareactiveprogramming.multithreading;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping("/api/v1/multithreading")
@RequiredArgsConstructor
public class PersonController {
    private final PersonService personService;

    @PostMapping(path="/save-persons")
    private String savePersons(@RequestBody List<Person> personList){
        personService.savePersons(personList);
        return "Saved!";
    }
}
