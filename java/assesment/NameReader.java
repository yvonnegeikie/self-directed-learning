package com.dyedurham.demo;

import java.io.IOException;

public interface NameReader {
    List<String> readNamesFromFile(String inputFile) throws IOException;
}
