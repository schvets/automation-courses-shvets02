package main.lessons.lesson12.application.androidApp;

import main.lessons.lesson12.application.Application;
import main.lessons.lesson12.application.StatisticScreen;

public class AndroidAppllication implements Application {
    @Override
    public AndroidAddEditScreen getAddEditScreen() {
        return new AndroidAddEditScreen();
    }

    @Override
    public AndroidLoginScreen getLoginScreen() {
        return new AndroidLoginScreen();
    }

    @Override
    public AndroidMainscreen getMainscreen() {
        return new AndroidMainscreen();
    }

    @Override
    public AndroidStatisticScreen getStatisticScreen() {
        return new AndroidStatisticScreen();
    }
}
