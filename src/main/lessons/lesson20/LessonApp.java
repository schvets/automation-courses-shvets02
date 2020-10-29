package main.lessons.lesson20;


import main.infrastusture.config.ConfigurationManager;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.ResourceBundle;

public class LessonApp {
    public static void main(String[] args) {
        ResourceBundle bundle = ResourceBundle.getBundle("en");
        System.out.println(encodeProp(bundle.getString("welcome_message")));
        System.out.println(encodeProp(bundle.getString("error_message")));

    }

    public static String encodeProp(String prop){
        String result = "";
        try {
            Charset.availableCharsets();
            result =  new String(prop.getBytes("ISO-8859-1"), Charset.forName("UTF-8"));

        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return result;
    }



}
