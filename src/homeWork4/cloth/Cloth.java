package homeWork4.cloth;

import homeWork4.Size;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public abstract class Cloth {
    private String name;
    private Size size;
    private int price;
    private String color;

    public Cloth(String name,Size size, int price, String color) {
        this.size = size;
        this.price = price;
        this.color = color;
        this.name = name;
    }
}
