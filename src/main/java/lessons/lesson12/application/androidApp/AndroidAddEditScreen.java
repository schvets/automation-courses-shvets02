package lessons.lesson12.application.androidApp;

import lessons.lesson12.application.AddEditScreen;
import lessons.lesson12.application.Mainscreen;

public class AndroidAddEditScreen implements AddEditScreen {

    @Override
    public AndroidAddEditScreen fillPetForm() {
        System.out.println("--> android set new color ");
        System.out.println("--> android set new name ");
        return this;
    }

    @Override
    public AddEditScreen savePet() {
        System.out.println("--> android save pet");
        return this;
    }

    public Mainscreen backButton() {
        System.out.println("--> android back to main screen");
        return new AndroidMainscreen();
    }
}
