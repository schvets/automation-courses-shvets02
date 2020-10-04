package main.lessons.lesson12.application.IOsApp;

import main.lessons.lesson12.application.Application;

public class IosAppllication implements Application {
    @Override
    public IOsAddEditScreen getAddEditScreen() {
        return new IOsAddEditScreen();
    }

    @Override
    public IosLoginScreen getLoginScreen() {
        return new IosLoginScreen();
    }

    @Override
    public IOsMainscreen getMainscreen() {
        return new IOsMainscreen();
    }

    @Override
    public IosStatisticScreen getStatisticScreen() {
        return new IosStatisticScreen();
    }
}
