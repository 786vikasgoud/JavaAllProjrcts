package org.example;

import java.io.InputStream;
import java.util.Properties;


public class ConfigRead {
    Properties properties;
    public ConfigRead(){
        loadProperties();
    }
    public void loadProperties(){
        properties=new Properties();
        try(InputStream input= getClass().getClassLoader().getResourceAsStream("config.properties")){
            if(input!=null){
                properties.load(input);
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
    public String getData(){
        //System.out.println(properties.getProperty("Amazon"));
        return properties.getProperty("Amazon");
    }
}
