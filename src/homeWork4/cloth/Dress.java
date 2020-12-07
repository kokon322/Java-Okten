package homeWork4.cloth;

import homeWork4.Size;
import homeWork4.interfaces.WomanCloth;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Dress extends Cloth implements WomanCloth {
    public Dress(String name,Size size, int price, String color) {
        super(name,size, price, color);
    }

    @Override
    public void dressAWoman() {
        System.out.println(this.getName()+" Dress on a woman");
    }
}
