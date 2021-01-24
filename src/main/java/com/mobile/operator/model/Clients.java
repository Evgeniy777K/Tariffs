package com.mobile.operator.model;

import java.util.List;

public interface Clients {
    // Интерфейс для сохранения/извлечения сущности из базы данных
    List<MobileClient> findAll();

}
