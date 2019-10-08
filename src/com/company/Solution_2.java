package com.company;

import java.io.*;

public class Solution_2 {
    public static void main(String[] args) throws IOException {
        File dir = new File(".");
        String [] names = dir.list();
        for (String string:names) {
            System.out.println(string);
        }
        File file = new File(".gitignore");
        File text = new File("text1.txt");
        System.out.println(file.length());
        FileInputStream fileInputStream = new FileInputStream(file);
        int length = fileInputStream.available();
        System.out.println(length);
        byte[]date = new byte[length];
        fileInputStream.read(date);
        for (byte i:date) {
            System.out.print(i + " ");
        }
        String string = new String(date);
        System.out.println(string);

        FileOutputStream fileOutputStream = new FileOutputStream(text);
        String newString = "Hello world";
        byte [] newStringByts = newString.getBytes();
        fileOutputStream.write(newStringByts);
        fileOutputStream.close();
    }
}
