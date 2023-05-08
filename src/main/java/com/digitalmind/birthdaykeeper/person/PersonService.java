package com.digitalmind.birthdaykeeper.person;

import com.digitalmind.birthdaykeeper.database.model.Person;
import com.digitalmind.birthdaykeeper.database.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
@RequiredArgsConstructor
public class PersonService {

    private final PersonRepository personRepository;

    public ResponseEntity<String> create(CreatePersonRequest request) {
        if (request.getBirthDate().isAfter(LocalDate.now())) {
            return new ResponseEntity<>("Birthdate cannot be in the future", HttpStatus.BAD_REQUEST);
        }
        personRepository.save(Person.builder()
                .birth_date(request.getBirthDate())
                .name(request.getName())
                .build());
        return new ResponseEntity<>("Person is added", HttpStatus.OK);
    }
}
