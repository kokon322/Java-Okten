package homeWork3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public abstract class Animal {
    private int age;
    private String name;

    public abstract void showAge();
    public abstract void showName();
}

