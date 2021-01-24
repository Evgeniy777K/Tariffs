package com.mobile.operator.model;

import java.util.List;

public class TariffImplement implements Tariff {
    private final List<MobileTariff> tariffList;

    //метод fromTariffType действует как база данных в памяти
    public TariffImplement() {
        this.tariffList = TariffDataBase.fromTariffType();
    }

    @Override
    public List<MobileTariff> findAll() {
        return this.tariffList;
    }
}
