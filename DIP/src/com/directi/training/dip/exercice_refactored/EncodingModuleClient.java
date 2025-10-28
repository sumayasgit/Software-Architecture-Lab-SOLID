package com.directi.training.dip.exercice_refactored;

import java.io.IOException;
import java.net.URL;

public class EncodingModuleClient
{
    public static void main(String[] args) throws IOException
    {
        // Encoding using files
        Reader fileReader = new FileDataReader("beforeEncryption.txt");
        Writer fileWriter = new FileDataWriter("afterEncryption.txt");
        EncodingModule fileEncoding = new EncodingModule(fileReader, fileWriter);
        fileEncoding.encode();

        // Encoding using network and database
        Reader networkReader = new NetworkDataReader(new URL("http", "myfirstappwith.appspot.com", "/index.html"));
        Writer dbWriter = new DatabaseDataWriter();
        EncodingModule networkEncoding = new EncodingModule(networkReader, dbWriter);
        networkEncoding.encode();
    }
}