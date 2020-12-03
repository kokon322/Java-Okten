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
public class Book implements Printable {
    private String name;

    public static void printBooks(ArrayList<Printable> printable) {
        for (Printable printable1 : printable) {
            if (printable1 instanceof Book) {
                printable1.print();
            }
        }
    }

    @Override
    public void print() {
        if (this.name == null) {
            System.out.println("This book dont have name");
        } else System.out.println("Name of this book: " + name);

    }
}
