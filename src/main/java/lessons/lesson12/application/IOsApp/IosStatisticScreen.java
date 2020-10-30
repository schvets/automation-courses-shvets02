package lessons.lesson12.application.IOsApp;

import lessons.lesson12.application.StatisticScreen;

public class IosStatisticScreen implements StatisticScreen {

    @Override
    public void chechFeeding() {
        System.out.println("--> Ios chechfeeding");
    }

    @Override
    public void viewGraph() {
        System.out.println("--> Ios chechfeeding");
    }

    public void backButton() {
        System.out.println("--> Ios back to main screen");
    }
}
