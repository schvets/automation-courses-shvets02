package main.lessons.lesson12.application.IOsApp;

import main.lessons.lesson12.application.AddEditScreen;
import main.lessons.lesson12.application.LoginScreen;
import main.lessons.lesson12.application.Mainscreen;
import main.lessons.lesson12.application.StatisticScreen;

public class IOsMainscreen implements Mainscreen {
    @Override
    public IOsMainscreen checkPetstatus() {
        System.out.println("--> Ios check details of last feeding");
        return this;
    }

    @Override
    public IOsMainscreen addFood() {
        System.out.println("--> Ios add food");
        System.out.println("--> Ios add water");
        return this;

    }

    @Override
    public AddEditScreen goToAddEditScreen() {
        System.out.println("--> Ios navigate to edit screen ");
        return new IOsAddEditScreen();
    }

    @Override
    public LoginScreen logOut() {
        System.out.println("--> Ios log out ");
        return new IosLoginScreen();
    }

    @Override
    public StatisticScreen goToStatisticScreen() {
        System.out.println("--> Ios got to  StatisticScreen");
        return new IosStatisticScreen();
    }

}
