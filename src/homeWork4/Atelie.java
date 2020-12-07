package homeWork4;

import homeWork4.cloth.Cloth;
import homeWork4.interfaces.MenCloth;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class Atelie {
    Cloth [] arrayOfCloth;

    public Atelie(Cloth[] arrayOfCloth) {
        this.arrayOfCloth = arrayOfCloth;
    }


}
