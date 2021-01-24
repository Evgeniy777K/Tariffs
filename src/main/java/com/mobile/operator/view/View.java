package com.mobile.operator.view;

import com.mobile.operator.exception.MyException;
import com.mobile.operator.model.InputValue;
import com.mobile.operator.model.MobileClient;
import com.mobile.operator.model.MobileTariff;
import com.mobile.operator.utils.ReadFromProp;
import com.mobile.operator.utils.ReadingFromFile;
import com.mobile.operator.utils.WriteToProp;
import com.mobile.operator.utils.WritingToFile;

import java.util.List;


public class View {

    public static void printAllTariff(List<MobileTariff> tariffs, List<MobileClient> clients) throws Exception {
        System.out.println("======Welcome to the Kyivstar ======\n\tPlease tell me how can I help you:");
        System.out.println("Press 1 - get info tariffs.\nPress 2 - get info clients." +
                "\nPress 3 - Write and read tariffs." + "\nPress 4 - Write and read clients." + "\nPress 5 - Return client and tariff.");
        System.out.print("Please make you choice: ");

        int selection = InputValue.inputValue();
        switch (selection) {
            case 1:
                for (MobileTariff tariff : tariffs) {
                    System.out.println(tariff);
                }
                break;
            case 2:
                for (MobileClient client : clients) {
                    System.out.println(client);
                }
                break;
            case 3:
                WritingToFile.writeToFileTariffs(tariffs);
                ReadingFromFile.readFileTariffs();
                break;
            case 4:
                WritingToFile.writeToFileClients(clients);
                ReadingFromFile.readFileClients();
                break;
            case 5:
                WriteToProp.setValueToProperties("app.properties", "Petr", "Smart");
                ReadFromProp.getValueFromProperties("app.properties", "Petr");
                break;
            default:
                throw new MyException("Wrong number");

        }
    }
}

