package homeWork4;

import homeWork4.cloth.*;
import homeWork4.interfaces.MenCloth;
import homeWork4.interfaces.WomanCloth;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;

@Getter
@Setter
@ToString

public class Atelie {
    Dress puma = new Dress("Puma", Size.S, 1500, "pink");
    Pants levis = new Pants("Levis", Size.L, 3500, "blue");
    Tie boss = new Tie("Boss", Size.XS, 500, "black");
    TShirt nike = new TShirt("Nike", Size.M, 1350, "wight");
    Cloth[] array = {puma, levis, boss, nike};


    public ArrayList<Cloth> getMenCloth() {
        ArrayList<Cloth> menCloth = new ArrayList<>();
        for (int i = 0; i < this.array.length; i++) {
            if (this.array[i] instanceof MenCloth) {
                menCloth.add(array[i]);
            }
        }
        return menCloth;
    }

    public ArrayList<Cloth> getWomanCloth() {
        ArrayList<Cloth> womanCloth = new ArrayList<>();
        for (int i = 0; i < this.array.length; i++) {
            if (this.array[i] instanceof WomanCloth) {
                womanCloth.add(array[i]);
            }
        }
        return womanCloth;
    }
}
