package lessons.lesson15;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ExeptionLesson {
    public static void main(String[] args) {
        System.out.println(doSomeThing(4,"2"));
        System.out.println(doSomeThing(4,"0"));
        System.out.println(doSomeThing(0,"0"));
    }

    public static String doSomeThing(int a, String b){
        try{
            return String.format("%s /  %s" + "= " + a/Integer.parseInt(b), a,b);
        }
        catch (ArithmeticException e){
            System.out.println("0 not acceptable");
            return String.format("%s /  %s", a,b);
        }
        finally {
            return String.valueOf(999);
        }
    }
}
