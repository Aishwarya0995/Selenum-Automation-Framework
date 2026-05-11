package com.framework.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    Properties prop;

    public ConfigReader() throws IOException {

        prop = new Properties();

        FileInputStream fis = new FileInputStream(
                "src/test/resources/config.properties");

        prop.load(fis);
    }

    public String getProperty(String key) {
        return prop.getProperty(key);
    }
}