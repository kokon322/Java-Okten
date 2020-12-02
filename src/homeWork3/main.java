package homeWork3;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {

        Triangle triangle1 = new Triangle(2, 3, 5);
        Triangle triangle2 = new Triangle(1, 6, 5);
        Square square1 = new Square(3);
        Square square2 = new Square(4);


        ArrayList<GeometricFigure> array = new ArrayList<>();

        array.add(triangle1);
        array.add(triangle2);
        array.add(square1);
        array.add(square2);

        int totalSquare = 0;

        for (GeometricFigure geometricFigure : array) {
            totalSquare += geometricFigure.calculateSquare();
        }

        System.out.println(totalSquare);

    }
}
