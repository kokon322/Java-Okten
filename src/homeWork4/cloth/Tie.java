package homeWork4.cloth;

import homeWork4.interfaces.MenCloth;
import homeWork4.Size;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Tie extends Cloth implements MenCloth {
    public Tie(String name,Size size, int price, String color) {
        super(name,size, price, color);
    }

    @Override
    public void dressAMan() {
        System.out.println(this.getName()+ " Dress on a man");
    }
}
