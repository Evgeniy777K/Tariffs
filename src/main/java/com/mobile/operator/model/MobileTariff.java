package com.mobile.operator.model;

import org.apache.log4j.Logger;

public class MobileTariff {
//    private final static Logger LOGGER = Logger.getLogger(MobileTariff.class);

    private long id;
    private String name;
    private int costPackage;
    private int limitMinuteInNet;

    public MobileTariff() {

    }

    public MobileTariff(long id, String name, int costPackage, int limitMinuteInNet) {
        this.id = id;
        this.name = name;
        this.costPackage = costPackage;
        this.limitMinuteInNet = limitMinuteInNet;
    }


    public long getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCostPackage() {
        return costPackage;
    }


    public int getLimitMinuteInNet() {
        return limitMinuteInNet;
    }


    @Override
    public String toString() {
        return "MobileTariff{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", costPackage=" + costPackage +
                ", limitMinuteInNet=" + limitMinuteInNet +
                '}';
    }

}
