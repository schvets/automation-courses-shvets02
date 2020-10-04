package main.lessons.lesson12.application.androidApp;

import main.lessons.lesson12.application.AddEditScreen;
import main.lessons.lesson12.application.IOsApp.IOsAddEditScreen;
import main.lessons.lesson12.application.IOsApp.IOsMainscreen;
import main.lessons.lesson12.application.IOsApp.IosLoginScreen;
import main.lessons.lesson12.application.IOsApp.IosStatisticScreen;
import main.lessons.lesson12.application.LoginScreen;
import main.lessons.lesson12.application.Mainscreen;
import main.lessons.lesson12.application.StatisticScreen;

public class AndroidMainscreen implements Mainscreen {

    @Override
    public AndroidMainscreen checkPetstatus() {
        System.out.println("--> android check details of last feeding");
        return this;
    }

    @Override
    public AndroidMainscreen addFood() {
        System.out.println("--> android add food");
        System.out.println("--> android add water");
        return this;
    }

    @Override
    public AddEditScreen goToAddEditScreen() {
        System.out.println("--> android navigate to edit screen ");
        return new AndroidAddEditScreen();
    }

    @Override
    public LoginScreen logOut() {
        System.out.println("--> android log out ");
        return new AndroidLoginScreen();
    }

    @Override
    public StatisticScreen goToStatisticScreen() {
        System.out.println("--> android got to  StatisticScreen");
        return new AndroidStatisticScreen();
    }

}
