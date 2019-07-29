package com.tavisca.workshops.second.workingwithfiles;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReader {
    public String readFile(String fileName) throws FileNotFoundException {
        BufferedInputStream reader = new BufferedInputStream(new FileInputStream(fileName));
        StringBuilder result = new StringBuilder();
        try(reader){
            byte[] buffer = new byte[8];
            int count;
            while((count = reader.read(buffer)) > 0){
                if(count < 8)
                    buffer[count] = '\0';
                result.append(new String(buffer));
                buffer = new byte[8];
            }
        }catch (IOException e){
            System.out.println("Exception: " + e.getMessage());
        }
            return result.toString();
    }
}
