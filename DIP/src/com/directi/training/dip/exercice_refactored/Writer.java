package com.directi.training.dip.exercice_refactored;

import java.io.IOException;

public interface Writer {
    void write(String encodedData) throws IOException;
}