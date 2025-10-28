package com.directi.training.srp.exercice_refactored;

import java.util.List;

public class bestCar {
    
     public car getBestCar(List<car> cars)
    {
        car bestCar = null;
        for (car car : cars) {
            if (bestCar == null || car.getModel().compareTo(bestCar.getModel()) > 0) {
                bestCar = car;
            }
        }
        return bestCar;
    }

}