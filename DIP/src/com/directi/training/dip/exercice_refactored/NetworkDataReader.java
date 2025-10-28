package com.directi.training.dip.exercice_refactored;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class NetworkDataReader implements Reader
{
    private final URL url;

    public NetworkDataReader(URL url)
    {
        this.url = url;
    }

    @Override
    public String read() throws IOException
    {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line);
            }
        }
        return content.toString();
    }
}