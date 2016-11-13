package com.etu.titkov.uniteacher;

import com.etu.titkov.uniteacher.service.DaoDecorator;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        AppController controller = new AppController(new DaoDecorator());
        AppConsole cli = new AppConsole(controller);
        cli.showMainMenu();
    }
}
