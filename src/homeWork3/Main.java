package homeWork3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Baraban b = new Baraban(25);
        Baraban s = new Baraban(12);

        Gitar a = new Gitar(9);
        Gitar c = new Gitar(10);

        ArrayList <Instrument> array  = new ArrayList<>();
        array.add(b);
        array.add(s);
        array.add(a);
        array.add(c);

        for (Instrument instrument : array) {
            instrument.play();
        }

    }
}
