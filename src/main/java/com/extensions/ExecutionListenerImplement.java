package com.extensions;

import com.extensions.CustomTestExecutionListener;
import org.junit.platform.launcher.Launcher;
import org.junit.platform.launcher.LauncherDiscoveryRequest;
import org.junit.platform.launcher.TestExecutionListener;
import org.junit.platform.launcher.core.LauncherDiscoveryRequestBuilder;
import org.junit.platform.launcher.core.LauncherFactory;

import static org.junit.platform.engine.discovery.ClassNameFilter.includeClassNamePatterns;
import static org.junit.platform.engine.discovery.DiscoverySelectors.selectPackage;

public class ExecutionListenerImplement {

    public void listener() {
        //LauncherDiscoveryRequest which should get all tests in specified path
        LauncherDiscoveryRequest request = LauncherDiscoveryRequestBuilder.request().selectors(selectPackage("test.java.com.calculator")).filters(includeClassNamePatterns(".*Test*.")).build();
        Launcher launcher = LauncherFactory.create();
        //Create an instance of the custom listener
        TestExecutionListener listener = new CustomTestExecutionListener();
        //Register the launcher & execute
        launcher.registerTestExecutionListeners(listener);
        launcher.execute(request, listener);
    }
}
