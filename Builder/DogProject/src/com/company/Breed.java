package com.company;

public enum Breed {BEAGLE(40), LABRADOR(100), POODLE(80), MUTT(180);
    int maxWeightPounds;
    Breed(int maxWeightPounds) {
        this.maxWeightPounds = maxWeightPounds;
    }
}