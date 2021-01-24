package com.mobile.operator.model;

import java.util.ArrayList;
import java.util.List;

public enum ClientDataBase {
    PETR("Petr", "80975864581", "Smart", 1978),
    OLGA("Olga", "80978754587", "SmartBasic", 1999),
    VITA("Vita", "80978974525", "SmartMax", 1988),
    VITALIY("Vitaliy", "80508974525", "SmartPlus", 1987),
    JACK("Jack", "80968974533", "SmartBusiness", 1989),
    JACKSON("Jackson", "80968974527", "SmartBusinessPlus", 1977);

    private final String name;
    private final String phoneNumber;
    private final String tariff;
    private final int year;

    ClientDataBase(String name, String phoneNumber, String tariff, int year) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.tariff = tariff;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }



    public int getYear() {
        return year;
    }

    public static List<MobileClient> fromClientDataBase() {
        List<MobileClient> clients = new ArrayList<>();
        for (ClientDataBase clientDB : values()) {
            clients.add(new MobileClient(clientDB.name, clientDB.phoneNumber,clientDB.tariff, clientDB.year));
        }
        return clients;
    }

    @Override
    public String toString() {
        return "ClientDataBase{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", tariff='" + tariff + '\'' +
                ", year=" + year +
                '}';
    }
}
