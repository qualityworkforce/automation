package com.ff.psa.configurations;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationManager {


    public String url;
    public String username;
    public String password;

    public ConfigurationManager()
    {
        readProperties();
    }


    public static void main(String[] args){

        ConfigurationManager configurationManager = new ConfigurationManager();
        String url      = configurationManager.url;
        String username = configurationManager.username;
        String password = configurationManager.password;

    }


    public void readProperties() {
       Properties properties = new Properties();
        String propertyFilePath = "/Users/ambichaliki/Documents/automation/src/test/resources/config/environment.properties";

        try {
            properties.load(new FileInputStream(propertyFilePath));
        } catch (IOException e) {
            e.printStackTrace();
        }

        url = properties.getProperty("url");
        username = properties.getProperty("username");
        password = properties.getProperty("password");
        System.out.println(url);
        System.out.println(username);
        System.out.println(password);

    }


}
