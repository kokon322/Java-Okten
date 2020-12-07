package homeWork4;

import homeWork4.cloth.Cloth;
import homeWork4.cloth.Pants;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Atelie s = new Atelie();

        ArrayList<Cloth> menCloth = s.getMenCloth();
        ArrayList<Cloth> womanCloth = s.getWomanCloth();

        for (Cloth cloth : womanCloth) {
            System.out.println();
        }
    }


}
