package ru.shevelev;

import ru.shevelev.enumerable.PremisesView;
import ru.shevelev.enumerable.SubdivisionView;

public class Main {
        public static void main(String[] args) {
            Subdivision subdivision = new Subdivision("КорпусПервый", SubdivisionView.АДМИНИСТРАТИВНЫЙ);
            Premises premises = new Premises(1,PremisesView.АКТОВЫЙ_ЗАЛ,30,20,subdivision);
            System.out.println(premises.getArea());

    }
}
