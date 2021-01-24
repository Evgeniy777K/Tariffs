package com.mobile.operator.view;

import com.mobile.operator.controller.MobileTariffController;

public class Executor {
    public static void main(String[] args) throws Exception {
        MobileTariffController tariffController = new MobileTariffController();
        tariffController.start();
        tariffController.tariffsAndClientsAll();

    }
}

