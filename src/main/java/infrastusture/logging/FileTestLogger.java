package infrastusture.logging;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class FileTestLogger implements AbstractLogger{
    private Object FileWriter;

    public void log(String opreration){
        try {
            FileWriter fileWriter = new FileWriter(new File("log.txt"), true);
            fileWriter.write(opreration +"\n");
            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void atStart(){
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(new File("log.txt"), true);
            fileWriter.write(String.format(WELCOME_MESSAGE, LocalDateTime.now() ,"\n"));
            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void atFinish(){
        try {
            FileWriter fileWriter= new FileWriter(new File("log.txt"), true);
            fileWriter.write(String.format(FINAL_MESSAGE, LocalDateTime.now()) +"\n");
            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
