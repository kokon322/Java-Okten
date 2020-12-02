package homeWork3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public abstract class Animal {
    private String name;
    private int birthdayYear;
    private int deadDay;

    public abstract void showAge();

    public abstract int ageCalculate();

    public abstract void showName();
}

