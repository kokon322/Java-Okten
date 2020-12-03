package homeWork3;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Magazine implements Printable {
    private String name;

    public static void printMagazines(ArrayList<Printable> printable) {
        for (Printable printable1 : printable) {
            if (printable1 instanceof Magazine) {
                printable1.print();
            }
        }
    }

    @Override
    public void print() {
        System.out.println("Name of this magazine: " + name);
    }
}
