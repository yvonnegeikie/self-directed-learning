package com.dyedurham.demo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// NameSorter class reads names from the file, sorts them, logs them, and writes them to another file
public class NameSorter {

    // The main method is the entry point of the program
    // It checks if the correct number of arguments is provided, creates an instance
    // of NameSorter, and calls its methods
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java NameSorter <input-file>");
            System.exit(1);
        }

        String inputFile = args[0];
        String outputFile = "./sorted-names-list.txt";

        // Create an instance of NameSorter
        NameSorter sorter = new NameSorter();

        // Read names from the input file
        List<String> names = sorter.readNamesFromFile(inputFile);

        // Sort the names
        sorter.sortNames(names);

        // Log the sorted names
        sorter.logSortedNames(names);

        // Write the sorted names to the output file
        sorter.writeNamesToFile(names, outputFile);

        System.out.println("Names sorted successfully and saved to sorted-names-list.txt");
    }

    // This method sorts a list of names in alphabetical order.
    private void sortNames(List<String> names) {
        Collections.sort(names);
    }

    // This method logs a list of names to the console.
    private void logSortedNames(List<String> names) {
        System.out.println("Sorted names:");
        for (String name : names) {
            System.out.println(name);
        }
    }

    // This method writes a list of names to a file.
    // It handles IOExceptions by printing an error message and throwing a
    // RuntimeException
    private void writeNamesToFile(List<String> names, String outputFile) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            for (String name : names) {
                writer.write(name);
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
            throw new RuntimeException(e);
        }
    }
}