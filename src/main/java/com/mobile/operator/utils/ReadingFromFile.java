package com.mobile.operator.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFromFile {
    static String file = "src/data/out.txt";

    //    Read Object from file
    public static void readFileTariffs() throws IOException {
        BufferedReader bufferedReader = null;
        try {
            String sCurrentLine;
            bufferedReader = new BufferedReader(new FileReader(file));
            while ((sCurrentLine = bufferedReader.readLine()) != null) {
                System.out.println(sCurrentLine);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if (bufferedReader != null)
                bufferedReader.close();
        }
    }
    public static void readFileClients() throws IOException {
        BufferedReader bufferedReader = null;
        try {
            String sCurrentLine;
            bufferedReader = new BufferedReader(new FileReader(file));
            while ((sCurrentLine = bufferedReader.readLine()) != null) {
                System.out.println(sCurrentLine);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if (bufferedReader != null)
                bufferedReader.close();
        }
    }
}


