package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution_1 {

    public static void main(String[] args) throws FileNotFoundException {
        //String separator = File.separator;
        //String path = "C:" +separator+ "Users" +separator+ "HP" +separator+ "IdeaProjects" +separator+ "IO" +separator+ "src" +separator+ "com" +separator+ "company" +separator+ "text.txt";
        String path = "C:\\Users\\HP\\IdeaProjects\\IO\\src\\com\\company\\test.txt";
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            String string = scanner.nextLine();
            System.out.println(string);
        }

        scanner.close();


    }
}
