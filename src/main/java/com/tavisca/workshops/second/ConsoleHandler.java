package com.tavisca.workshops.second;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;

public class ConsoleHandler {
    public static void main(String[] args) {
        String data = readFromConsole();
        System.out.print("Data from console: ");
        writeToConsole(data);
    }

    private static void writeToConsole(String data) {
        BufferedOutputStream writer = new BufferedOutputStream(System.out);
        try {
            writer.write(data.getBytes());
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String readFromConsole() {
        BufferedInputStream reader = new BufferedInputStream(System.in);
        StringBuilder result = new StringBuilder();
        try {
            int inp;
            while ((inp = reader.read()) != (int) '\n')
                result.append((char) inp);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result.toString();
    }
}
