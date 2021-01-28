package com.mobile.operator.model;

import java.util.List;

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
