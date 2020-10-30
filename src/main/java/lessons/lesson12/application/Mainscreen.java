package lessons.lesson12.application;


public interface Mainscreen {
    Mainscreen checkPetstatus();
    Mainscreen addFood();

    AddEditScreen goToAddEditScreen();
    LoginScreen logOut();
    StatisticScreen goToStatisticScreen();
}
