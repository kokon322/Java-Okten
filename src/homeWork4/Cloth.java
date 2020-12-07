package homeWork4;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public abstract class Cloth {
    private Size size;
    private int price;
    private String color;

    public Cloth(Size size, int price, String color) {
        this.size = size;
        this.price = price;
        this.color = color;
    }
}
