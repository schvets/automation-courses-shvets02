package main.infrastusture.logging;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class AbstractLogger {
    public static int counter = 0;

    public abstract void log(String msg);

    public String getEntry(String opreration) {
        counter++;
        Date curDate = new Date();
        String formatedDate = new SimpleDateFormat("HH:mm:ss.SSS").format(curDate.getTime());
        return counter + ") " + formatedDate + "[" + Thread.currentThread().getName() + "]: " + opreration;
    }
}
