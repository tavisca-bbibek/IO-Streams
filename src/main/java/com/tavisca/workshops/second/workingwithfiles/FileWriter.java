package com.tavisca.workshops.second.workingwithfiles;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriter {
    public void writeFile(String fileName, String data) throws FileNotFoundException {

        try(FileOutputStream writer = new FileOutputStream(fileName)){
            writer.write(data.getBytes());
        } catch (IOException e){
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
