package homeWork3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Book warAndWorld = new Book("War and World");
        Book tereodoryZWasykiwku = new Book("Tereodory z Wasykiwku");
        Book noName = new Book();

        Magazine auto = new Magazine("Auto magazine");
        Magazine playBoy = new Magazine("Play Boy");

        ArrayList<Printable> array = new ArrayList<>();

        array.add(warAndWorld);
        array.add(tereodoryZWasykiwku);
        array.add(noName);
        array.add(auto);
        array.add(playBoy);
//First task//
//        for (Printable printable : array) {
//            printable.print();
//        }
//Second tasc//
        Book.printBooks(array);
        Magazine.printMagazines(array);
    }
}
