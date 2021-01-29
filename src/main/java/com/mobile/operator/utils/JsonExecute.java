package com.mobile.operator.utils;


import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mobile.operator.model.MobileTariff;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.nio.file.Paths;

public class JsonExecute {
    private final static Logger LOGGER = Logger.getLogger(JsonExecute.class);

    public String convertJavaToJsonStr(Object obj) {
        String jsonStr = "";
        try {
            jsonStr = new ObjectMapper().writeValueAsString(obj);
            LOGGER.info("convert to string, finished!");

        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return jsonStr;
    }

    public void convertJavaToJsonFile(Object obj, String pathToFile) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.writeValue(Paths.get(pathToFile).toFile(), obj);
            LOGGER.info("write to file, finished!");
        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public MobileTariff convertJsonStrTOAnimalPOJO(String jsonStr) {

        MobileTariff mobileTariff = null;
        try {
            ObjectMapper mapper = new ObjectMapper();
            mobileTariff = mapper.readValue(jsonStr, MobileTariff.class);
            LOGGER.info("convert to POJO, finished!");
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return mobileTariff;
    }
}
