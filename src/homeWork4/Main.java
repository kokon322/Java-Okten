package homeWork4;

import homeWork4.cloth.*;


public class Main {
    public static void main(String[] args) {
        Dress puma = new Dress(Size.S,1500,"pink");
        Pants levis = new Pants(Size.L,3500,"blue");
        Tie boss = new Tie(Size.XS,500,"black");
        TShirt nike = new TShirt(Size.M,1350,"wight");

        Cloth [] array = {puma,levis,boss,nike};
        Atelie s = new Atelie(array);




    }
}
