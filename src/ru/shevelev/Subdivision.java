package ru.shevelev;

import ru.shevelev.enumerable.SubdivisionView;

/**
 * Created by Денис on 04.12.2016.
 */
public class Subdivision {
    private String name;
    private SubdivisionView view; /*вид подразделения*/

    public Subdivision(String name, SubdivisionView view) {
        this.name = name;
        this.view = view;
    }

    public String getName() {
        return name;
    }

    public SubdivisionView getView() {
        return view;
    }
}
