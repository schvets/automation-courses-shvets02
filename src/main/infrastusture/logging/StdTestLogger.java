package main.infrastusture.logging;

public class StdTestLogger extends AbstractLogger{
    public static int counter = 0;


    public void log(String opreration){
        System.out.println(getEntry(opreration));
    }
}
