package com.company;
import java.time.LocalDate;
import java.util.ArrayList;

public class DogDaycareApp {

    public static void main(String[] args) {
        Dog.DogBuilder dogBuilder = new Dog.DogBuilder();
        dogBuilder.dob(LocalDate.of(2019, 03, 30))
                .vax(LocalDate.of(2020, 12, 30))
                .name("Fido")
                .breed(Breed.BEAGLE)
                .meal("chicken and rice")
                .dogLicense(new DogLicense());
        Dog fido = dogBuilder.build();
        System.out.println(fido.report());

        dogBuilder.name("Jeff")
                .dogLicense(new DogLicense());
        Dog jeff = dogBuilder.build();
    }
}
