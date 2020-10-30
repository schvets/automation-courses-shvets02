package lessons.lesson12.application.androidApp;

import lessons.lesson12.application.LoginScreen;
import lessons.lesson12.application.Mainscreen;

public class AndroidLoginScreen implements LoginScreen {

    @Override
    public Mainscreen login() {
        System.out.println("--> android fill login ");
        System.out.println("--> android fill password ");
        System.out.println("--> android submit login form");
        return new AndroidMainscreen();
    }

    @Override
    public void register() {

    }

    @Override
    public void restorePassword() {

    }
}
