package com.mobile.operator.utils;

import com.mobile.operator.model.MobileClient;
import com.mobile.operator.model.MobileTariff;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

public class WritingToFile {
    static String file = "src/data/out.txt";

    //Write Object in file
    public static void writeToFileTariffs(List<MobileTariff> tariffs) {
        try {
            PrintWriter p = new PrintWriter(file);
            p.write(String.valueOf(tariffs));
            p.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static void writeToFileClients(List<MobileClient> clients) {
        try {
            PrintWriter p = new PrintWriter(file);
            p.write(String.valueOf(clients));
            p.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
