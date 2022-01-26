package com.jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.Payment;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class jacksonExample {

    private static final Logger LOGGER = LogManager.getLogger(jacksonExample.class);

    public static void main(String[] args) throws JsonProcessingException {
        Payment p = new Payment();
        p.setAmount(300);
        p.setCurrency("EUR");
        p.setCardNumber("873458374598");
        p.setCustomerName("Atreus of Midgard");

        ObjectMapper objectmapper = new ObjectMapper();
        String s = objectmapper.writeValueAsString(p);
        LOGGER.info(s);
        Payment dP = objectmapper.readValue(s, Payment.class);
        LOGGER.info(dP.equals(p));
    }
}
