package homeWork3;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Setter
@Getter
public class Gitar implements Instrument {
    private int struna;

    @Override
    public void play() {
        System.out.println("The Gitar play and it have: "+ struna);
    }
}
