package homeWork3;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Setter
@Getter
public class Baraban implements Instrument{
    private int size;

    @Override
    public void play() {
        System.out.println("It's Barabn play it size: "+ size);
    }
}
