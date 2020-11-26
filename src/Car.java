import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Car {
    int power;
    double liters;
    int year;
    String name;
    boolean areNew;
}
