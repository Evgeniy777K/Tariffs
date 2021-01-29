package com.mobile.operator.view;

import com.mobile.operator.controller.MobileTariffController;
import com.mobile.operator.model.MobileTariff;
import com.mobile.operator.model.TariffDataBase;
import com.mobile.operator.utils.JsonExecute;
import org.apache.log4j.Logger;

import java.util.List;

public class Executor {

    private final static Logger LOGGER = Logger.getLogger(Executor.class);

    public static void main(String[] args) throws Exception {

        MobileTariffController tariffController = new MobileTariffController();
        tariffController.start();
        tariffController.tariffsAndClientsAll();


        List<MobileTariff> tariffDataBase = TariffDataBase.fromTariffType();


        LOGGER.info(tariffDataBase);
        LOGGER.info("=============");

        JsonExecute jsonAction = new JsonExecute();

        String jsonStr = jsonAction.convertJavaToJsonStr(tariffDataBase);
        LOGGER.info(jsonStr);
        LOGGER.info("================");
        jsonAction.convertJavaToJsonFile(tariffDataBase, "tariffDataBase.json");

        String jsonStr1 = "{\"id\":1,\"name\":\"Smart\",\"costPackage\":105,\"limitMinuteInNet\":100}";
        MobileTariff mobileTariff = jsonAction.convertJsonStrTOAnimalPOJO(jsonStr1);
        LOGGER.info("Name from POJO: " + mobileTariff.getName());
        LOGGER.info("cost package from POJO: " + mobileTariff.getCostPackage());



    }
}

