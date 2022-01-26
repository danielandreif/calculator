package com.apache;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4j {
    private static final Logger LOGGER = LogManager.getLogger(Log4j.class);

    public void doSomething(String s) {
        LOGGER.info("doing something with {}", s);
    }

    public static void main(String[] args) {
        Log4j e = new Log4j();
        e.doSomething("variable");
    }
}
