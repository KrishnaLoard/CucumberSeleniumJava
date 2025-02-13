package com.krishnasProject.feature;

import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CollectionVariables {
    public static Gson environmentConfiguration;
    public static ConfigurationEnv configurationEnv = new ConfigurationEnv();
    public static final Logger LOGGER = LoggerFactory.getLogger(CollectionVariables.class);
}
