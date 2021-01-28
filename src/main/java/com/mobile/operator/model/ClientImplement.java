package com.mobile.operator.model;

import java.util.List;

public class ClientImplement implements Clients {
    //    acts like an in-memory database
    private final List<MobileClient> clientList;


    public ClientImplement() {
        this.clientList = ClientDataBase.fromClientDataBase();
    }

    @Override
    public List<MobileClient> findAll() {
        return this.clientList;
    }


}
