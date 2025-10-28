package com.directi.training.srp.exercice_refactored;

import java.util.Arrays;
import java.util.List;

public class repo {

    private List<car> _carsDb = Arrays
        .asList(new car("1", "Golf III", "Volkswagen"), new car("2", "Multipla", "Fiat"),
            new car("3", "Megane", "Renault"));


    public car getByID(final String carId)
    {
        for (car car : _carsDb) {
            if (car.getId().equals(carId)) {
                return car;
            }
        }
        return null;
    }

    public List<car> getALL()
    {
        return _carsDb ;
    }
    
}