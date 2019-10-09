package com.company;

import java.io.*;

public class Solution_3{
    public static void main(String[] args) throws IOException {
        File file = new File("text.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        Integer integer = 123;
        String string = "Hi!" + integer;
        byte[] date = string.getBytes();
        fileOutputStream.write(date);

        FileInputStream fileInputStream = new FileInputStream(file);
        int length = fileInputStream.available();
        byte[]newDate = new byte[length];
        fileInputStream.read(newDate);
        String string1 = new String(newDate);
        System.out.println(string1);

    }
}
