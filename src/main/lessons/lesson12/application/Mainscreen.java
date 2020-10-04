package main.lessons.lesson12.application;

import main.lessons.lesson12.application.IOsApp.IOsMainscreen;

public interface Mainscreen {
    Mainscreen checkPetstatus();
    Mainscreen addFood();

    AddEditScreen goToAddEditScreen();
    LoginScreen logOut();
    StatisticScreen goToStatisticScreen();
}
