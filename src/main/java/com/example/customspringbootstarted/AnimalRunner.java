package com.example.customspringbootstarted;

import org.example.Animal;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class AnimalRunner implements ApplicationRunner {

    private final Animal animal;

    public AnimalRunner(Animal animal) {
        this.animal = animal;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        log.info(animal.toString());
    }
}
