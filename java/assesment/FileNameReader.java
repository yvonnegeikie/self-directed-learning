package com.dyedurham.demo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.io.IOException;

public class FileNameReader implements NameReader {
    @Override
    public List<String> readNamesFromFile(String inputFile) throws IOException {
        List<String> names = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                names.add(line);
            }
        }
        return names;
    }
}
