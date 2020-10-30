package lessons.lesson12;


import lessons.lesson12.application.Application;
import lessons.lesson12.application.IOsApp.IosAppllication;
import lessons.lesson12.application.androidApp.AndroidAppllication;

import java.util.function.Predicate;

public class LessonApp {
    public static void main(String[] args) {

        Application android = new AndroidAppllication();

        android.getLoginScreen().login().checkPetstatus().addFood()
                .goToAddEditScreen().fillPetForm()
                .savePet().backButton().logOut();

        System.out.println("########################");
        Application iOs = new IosAppllication();

        iOs.getLoginScreen().login();
        iOs.getMainscreen().checkPetstatus();
        iOs.getMainscreen().addFood();
        iOs.getAddEditScreen().fillPetForm();
        iOs.getAddEditScreen().savePet();
        iOs.getAddEditScreen().backButton();
        iOs.getMainscreen().logOut();


    }
}
