package com.extensions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.platform.engine.TestExecutionResult;
import org.junit.platform.launcher.*;

public class CustomTestExecutionListener implements TestExecutionListener {

    public static final Logger LOGGER = LogManager.getLogger(CustomTestExecutionListener.class);

    @Override
    public void executionStarted(TestIdentifier testIdentifier) {
        LOGGER.info("Execution of test {} started", testIdentifier.getDisplayName());
    }
    @Override
    public void executionFinished(TestIdentifier testIdentifier, TestExecutionResult testExecutionResult) {
        LOGGER.info("Execution of test {} finished with {} result", testIdentifier.getDisplayName(), testExecutionResult.getStatus());
        LOGGER.info("--------------------------------------");
    }
}
