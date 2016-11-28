package com.etu.grigorova.otdel_kadrov;


import com.etu.grigorova.otdel_kadrov.dao.DaoDecor;

public class Lab3_3 {
    public static void main (String[] args) {
        System.out.println("Выполнила студентка\nГригорова Александра\n");
        System.out.println("Вариант № 3\n");

//  ,---.|                           |          ,---.     o
//  |---||    ,---..  ,,---.,---.,---|,---.,---.|  _.,---..,---.,---.,---.,---..    ,,---.
//  |   ||    |---' >< ,---||   ||   ||    ,---||   ||    ||   ||   ||    |   | \  / ,---|
//  `   '`---'`---''  ``---^`   '`---'`    `---^`---'`    ``---|`---'`    `---'  `'  `---^
//                                                         `---'

        LabLogic controller = new LabLogic(new DaoDecor());
        ConsoleOutput cons = new ConsoleOutput(controller);
        cons.showMainMenu();

    }
}
