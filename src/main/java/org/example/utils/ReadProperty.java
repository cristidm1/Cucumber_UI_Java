package org.example.utils;


import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadProperty {

    public static String getProperty(String propertyName) throws IOException {

        FileReader fileReader = new FileReader("src/test/resources/config.properties");
        Properties property = new Properties();
        property.load(fileReader);

        return property.getProperty(propertyName);
    }
}
