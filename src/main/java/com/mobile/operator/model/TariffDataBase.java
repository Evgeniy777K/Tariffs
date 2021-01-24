package com.mobile.operator.model;


import java.util.ArrayList;
import java.util.List;

public enum TariffDataBase {
    SMART(1, "Smart", 105, 100),
    SMARTBASIC(2, "SmartBasic", 150, 130),
    SMARTMAX(3, "SmartMax", 200, 170),
    SMARTPLUS(4, "SmartPlus", 250, 200),
    SMARTBUSINESS(5, "SmartBusiness", 400, 300),
    SMARTBUSINESSPLUS(6, "SmartBusinessPlus", 500, 400);

    private final long id;
    private final String name;
    private final int costPackage;
    private final int limitMinuteInNet;

    TariffDataBase(long id, String name, int costPackage, int limitMinuteInNet) {
        this.id = id;
        this.name = name;
        this.costPackage = costPackage;
        this.limitMinuteInNet = limitMinuteInNet;
    }

    public String getName() {
        return name;
    }

    //метод fromTariffType действует как база данных в памяти, которая заполнена значениями
    public static List<MobileTariff> fromTariffType() {
        List<MobileTariff> tariffs = new ArrayList<>();
        for (TariffDataBase type : values()) {
            tariffs.add(new MobileTariff(type.id, type.name, type.costPackage, type.limitMinuteInNet));
        }
        return tariffs;
    }

    @Override
    public String toString() {
        return "TariffType{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + costPackage +
                ", limitMinuteInNet=" + limitMinuteInNet +
                '}';
    }
}
