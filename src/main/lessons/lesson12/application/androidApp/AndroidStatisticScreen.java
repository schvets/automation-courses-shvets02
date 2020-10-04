package main.lessons.lesson12.application.androidApp;

import main.lessons.lesson12.application.StatisticScreen;

public class AndroidStatisticScreen implements StatisticScreen {

    @Override
    public void chechFeeding() {
        System.out.println("--> android chechfeeding");
    }

    @Override
    public void viewGraph() {
        System.out.println("--> android chechfeeding");
    }

    public void backButton() {
        System.out.println("--> android back to main screen");
    }
}
