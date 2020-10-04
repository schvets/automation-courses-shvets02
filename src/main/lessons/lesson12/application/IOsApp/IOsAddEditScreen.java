package main.lessons.lesson12.application.IOsApp;

import main.lessons.lesson12.application.AddEditScreen;
import main.lessons.lesson12.application.Mainscreen;

public class IOsAddEditScreen implements AddEditScreen {

    @Override
    public IOsAddEditScreen fillPetForm() {
        System.out.println("--> IOs set new color ");
        System.out.println("--> IOs confirm pet param change ");
        System.out.println("--> IOs set new name ");
        System.out.println("--> IOs confirm pet param change ");
        return this;
    }

    @Override
    public AddEditScreen savePet() {
        System.out.println("--> IOs save pet");
        System.out.println("--> IOs message aboust save ");
        return this;

    }

    public Mainscreen backButton() {
        System.out.println("--> IOs back to main screen");
        return new IOsMainscreen();
    }
}
