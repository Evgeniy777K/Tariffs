package com.mobile.operator.controller;

import com.mobile.operator.model.ClientImplement;
import com.mobile.operator.model.Clients;
import com.mobile.operator.model.Tariff;
import com.mobile.operator.model.TariffImplement;
import com.mobile.operator.model.MobileTariff;
import com.mobile.operator.model.MobileClient;
import com.mobile.operator.view.View;

import java.util.List;

public class MobileTariffController {
    private Tariff tariff;
    private Clients client;
    private View view;

    public void start() {
        view = new View();
        tariff = new TariffImplement();
        client = new ClientImplement();
    }


    public void tariffsAndClientsAll() throws Exception {
        List<MobileTariff> tariffs = tariff.findAll();
        List<MobileClient> clients = client.findAll();
        if (tariffs != null || clients != null) {
            view.printAllTariff(tariffs, clients);
        }
    }
}