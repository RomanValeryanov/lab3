package ru.shevelev;

import ru.shevelev.enumerable.PremisesView;

/**
 * Created by Денис on 04.12.2016.
 */
public class Premises {
    private int numer;/*номер помещения*/
    private PremisesView view;/*вид помещения*/
    private int area;/*площадь*/
    private int place;/*количество посадочных мест*/
    private Subdivision subdivision;/*подразделение*/

    public Premises(int numer, PremisesView view, int area, int place, Subdivision subdivision) {
        this.numer = numer;
        this.view = view;
        this.area = area;
        this.place = place;
        this.subdivision = subdivision;
    }

    public int getNumer() {
        return numer;
    }

    public PremisesView getView() {
        return view;
    }

    public int getArea() {
        return area;
    }

    public int getPlace() {
        return place;
    }

    public Subdivision getSubdivision() {
        return subdivision;
    }

}
