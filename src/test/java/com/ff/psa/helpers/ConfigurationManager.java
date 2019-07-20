package com.ff.psa.helpers;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class ConfigurationManager {

    Properties prop;

    public ConfigurationManager() {
        prop = new Properties();
        FileInputStream ip =
                null;
        try {
            ip = new FileInputStream("src/test/resources/configuration/config.properties");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            prop.load(ip);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(prop.getProperty("url"));
        System.out.println(prop.getProperty("url1"));
    }

    public static void main(String[] args) throws IOException {
        ConfigurationManager configurationManager = new ConfigurationManager();
        String url = configurationManager.prop.getProperty("url");
        System.out.println("*********" + url);

    }
}
