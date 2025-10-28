package com.directi.training.dip.exercice_refactored;

import java.io.IOException;
import java.util.Base64;

public class EncodingModule
{
    private final Reader reader;
    private final Writer writer;

    public EncodingModule(Reader reader, Writer writer)
    {
        this.reader = reader;
        this.writer = writer;
    }

    public void encode() throws IOException
    {
        String data = reader.read();
        String encoded = Base64.getEncoder().encodeToString(data.getBytes());
        writer.write(encoded);
    }
}