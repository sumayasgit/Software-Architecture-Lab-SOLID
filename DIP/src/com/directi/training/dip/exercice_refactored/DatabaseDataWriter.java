package com.directi.training.dip.exercice_refactored;

import java.util.HashMap;
import java.util.Map;

public class DatabaseDataWriter implements Writer
{
    private static final Map<Integer, String> DATA = new HashMap<>();
    private static int count = 0;

    @Override
    public void write(String data)
    {
        DATA.put(++count, data);
        System.out.println("Saved encoded data in DB with ID: " + count);
    }
}