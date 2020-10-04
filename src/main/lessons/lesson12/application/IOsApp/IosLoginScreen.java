package main.lessons.lesson12.application.IOsApp;

import main.lessons.lesson12.application.LoginScreen;
import main.lessons.lesson12.application.Mainscreen;

public class IosLoginScreen implements LoginScreen {

    @Override
    public IOsMainscreen login() {
        System.out.println("--> Ios fill login ");
        System.out.println("--> Ios fill password ");
        System.out.println("--> Ios submit login form");
        return new IOsMainscreen();
    }

    @Override
    public void register() {

    }

    @Override
    public void restorePassword() {

    }
}
