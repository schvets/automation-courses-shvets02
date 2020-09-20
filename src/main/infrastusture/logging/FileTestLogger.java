package main.infrastusture.logging;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileTestLogger extends AbstractLogger{
    private Object FileWriter;

    public void log(String opreration){
        try {
            FileWriter fileWriter= new FileWriter(new File("log.txt"), true);
            fileWriter.write(getEntry(opreration) +"\n");
            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
