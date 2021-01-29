package com.mobile.operator.model;

import org.apache.log4j.Logger;

import java.util.List;

// Реализация интерфейса
public class TariffImplement implements Tariff {
    //    acts like an in-memory database
    private final List<MobileTariff> tariffList;

    public TariffImplement() {
        this.tariffList = TariffDataBase.fromTariffType();
    }

    @Override
    public List<MobileTariff> findAll() {
        return this.tariffList;
    }
}
