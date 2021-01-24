package com.mobile.operator.model;

public class MobileClient {
    private String clientName;
    private String clientPhoneNumber;
    private String tariffType;
    private int year;


    public MobileClient() {

    }

    public MobileClient(String clientName, String clientPhoneNumber,String tariffType, int year) {
        this.clientName = clientName;
        this.clientPhoneNumber = clientPhoneNumber;
        this.tariffType = tariffType;
        this.year = year;
    }


    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getTariffType() {
        return tariffType;
    }

    public void setTariffType(String tariffType) {
        this.tariffType = tariffType;
    }

    @Override
    public String toString() {
        return "MobileClient{" +
                "clientName='" + clientName + '\'' +
                ", clientPhoneNumber='" + clientPhoneNumber + '\'' +
                ", tariffType='" + tariffType + '\'' +
                ", year=" + year +
                '}';
    }
}
