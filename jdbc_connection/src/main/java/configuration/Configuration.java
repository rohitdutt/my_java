package configuration;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Configuration {
    Properties prop=new Properties();
    public Configuration() {
        try {
            FileInputStream ip=new FileInputStream("/home/rohitdutt04/Desktop/workspace/my_java_learning/jdbcConnection/src/config.properties");
            prop.load(ip);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getLocalhostURL(){
            return prop.getProperty("localhost.ipl.url");
    }

    public String getLocalhostUser(){
        return prop.getProperty("localhost.ipl.user");
    }

    public String getLocalhostPassword(){
        return prop.getProperty("localhost.ipl.password");
    }

    public String getLocalhostPort(){
        return prop.getProperty("localhost.ipl.port");
    }

    public String getAWSURL(){
        return prop.getProperty("aws.ipldb.url");
    }

    public String getAWSUser(){
        return prop.getProperty("aws.ipldb.user");
    }

    public String getAWSPassword(){
        return prop.getProperty("aws.ipldb.password");
    }

    public String getAWSPort(){
        return prop.getProperty("aws.ipldb.port");
    }

    public String getLocalhostDriver(){
        return prop.getProperty("localhost.ipl.Driver");
    }

    public String getAWSDriver(){
        return prop.getProperty("aws.ipldb.Driver");
    }

}
