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
public class TShirt extends Cloth implements WomanCloth, MenCloth {
    public TShirt(Size size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressAMan() {


    }

    @Override
    public void dressAWoman() {

    }
}
