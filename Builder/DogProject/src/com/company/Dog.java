package com.company;

import java.time.LocalDate;

public class Dog {
    private final LocalDate dob;
    private LocalDate vax;
    private final String name;
    private final Breed breed;
    private String meal;
    private DogLicense dogLicense;

    public String report() {
        return "Dog{" +
                "dob=" + dob +
                ", vax=" + vax +
                ", name='" + name + '\'' +
                ", breed=" + breed +
                '}';
    }

    private Dog(DogBuilder b) {
        // We should validate Builder arguments/data
        dob = b.dob;
        vax = b.vax;
        name = b.name;
        breed = b.breed;
        meal = b.meal;
        dogLicense = b.dogLicense;
    }

    public static final class DogBuilder {
        private LocalDate dob;
        private LocalDate vax;
        private String name;
        private Breed breed;
        private String meal;
        private DogLicense dogLicense;

        public DogBuilder dob(LocalDate dob) {
            this.dob = dob;
            return this;
        }

        public DogBuilder vax(LocalDate vax) {
            this.vax = vax;
            return this;
        }

        public DogBuilder name(String name) {
            this.name = name;
            return this;
        }

        public DogBuilder breed(Breed breed) {
            this.breed = breed;
            return this;
        }

        public DogBuilder meal(String meal) {
            this.meal = meal;
            return this;
        }

        public DogBuilder dogLicense(DogLicense dogLicense) {
            this.dogLicense = dogLicense;
            return this;
        }

        public Dog build() {
            return new Dog(this);
        }
    }
}
