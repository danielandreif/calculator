package com.google;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class gsonExample {

    private static final Logger LOGGER = LogManager.getLogger(gsonExample.class);

    public static void main(String[] args) {

        Payment p = new Payment();
        p.setAmount(100);
        p.setCurrency("RON");
        p.setCardNumber("823175437534534");
        p.setCustomerName("Kratos of Sparta");

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(p);
        LOGGER.info("\n {}",json);

        Payment dP = gson.fromJson(json, Payment.class);
        LOGGER.info(p.equals(dP));
    }
}
