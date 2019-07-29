package com.tavisca.workshops.second.workingwithfiles;

import java.io.FileNotFoundException;

public class FileHandler {
    public static void main(String[] args) {
        writeToFile();
        readFromFile();
    }

    private static void readFromFile() {
        FileReader myFileReader = new FileReader();
        String fileName = "MyData.txt";
        try {
            String data = myFileReader.readFile(fileName);
            System.out.println(data);
        } catch (FileNotFoundException e) {
            System.out.println("Can't find " + fileName);
        }
    }

    private static void writeToFile() {
        FileWriter myFileWriter = new FileWriter();
        String data = "Hello! How are you today? Dude!";
        String fileName = "MyData.txt";
        try {
            myFileWriter.writeFile(fileName, data);
        } catch (FileNotFoundException e) {
            System.out.println("Can't find " + fileName);
        }
    }
}
