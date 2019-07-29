package com.tavisca.workshops.second;

import java.io.*;

public class PremitiveDataHandler {

    public static void main(String[] args) {
        String fileName = "premitive_data_file.txt";
        writeData(fileName);
        readData(fileName);
    }

    private static void readData(String fileName) {
        try {
            DataInputStream inputStream = new DataInputStream(new FileInputStream(fileName));
            int data1 = inputStream.readInt();
            String data2 = inputStream.readUTF();
            boolean data3 = inputStream.readBoolean();

            System.out.println("Int: " + data1);
            System.out.println("UTF-String: " + data2);
            System.out.println("Boolean: " + data3);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void writeData(String fileName) {
        FileOutputStream fileWriter =
                null;
        try {
            fileWriter = new FileOutputStream(fileName);
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }

        DataOutputStream writer = new DataOutputStream(fileWriter);
        try(writer){
            writer.writeInt(10);
            writer.writeUTF("UTF-String This is working by luck...");
            writer.writeBoolean(true);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
