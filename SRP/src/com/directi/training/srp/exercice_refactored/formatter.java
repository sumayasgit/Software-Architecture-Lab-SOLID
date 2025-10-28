package com.directi.training.srp.exercice_refactored;

import java.util.List;

public class formatter {

    public String getCarsNames(List<car> cars)
    {
        StringBuilder sb = new StringBuilder();
        for (car car : cars) {
            sb.append(car.getBrand());
            sb.append(" ");
            sb.append(car.getModel());
            sb.append(", ");
        }
        return sb.substring(0, sb.length() - 2);
    }
    
}