package com.mobile.operator.model;

import java.util.List;

public class ClientImplement implements Clients {
    private final List<MobileClient> clientList;

    //метод fromClientDataBase действует как база данных в памяти

    public ClientImplement() {
        this.clientList = ClientDataBase.fromClientDataBase();
    }

    @Override
    public List<MobileClient> findAll() {
        return this.clientList;
    }


}
