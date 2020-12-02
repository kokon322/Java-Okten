package homeWork3;

import lombok.AllArgsConstructor;

@AllArgsConstructor

public class Dog extends Animal {
    public Dog(String name, int birthdayYear, int deadDay) {
        super(name, birthdayYear, deadDay);
    }

    @Override
    public void showAge() {

    }

    @Override
    public int ageCalculate() {

        return getDeadDay() - getBirthdayYear() ;
    }

    @Override
    public void showName() {

    }
}
