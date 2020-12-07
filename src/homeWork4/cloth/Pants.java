package homeWork4.cloth;

import homeWork4.interfaces.MenCloth;
import homeWork4.Size;
import homeWork4.interfaces.WomanCloth;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Pants extends Cloth implements MenCloth, WomanCloth {
    public Pants(Size size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressAMan() {

    }

    @Override
    public void dressAWoman() {

    }
}
