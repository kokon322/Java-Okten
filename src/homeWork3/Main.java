package homeWork3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cat vasya = new Cat("Vasya", 1992, 2000);
        Cat dotsa = new Cat("Dotsa", 2016, 2025);
        Dog gera = new Dog("Gera", 2015, 2050);
        Dog bady = new Dog("Bady", 2020, 2050);

        ArrayList<Animal> allAnimal = new ArrayList<>();

        allAnimal.add(vasya);
        allAnimal.add(dotsa);
        allAnimal.add(gera);
        allAnimal.add(bady);

        int sumOfAgeAllAnimal = 0;

        for (Animal animal : allAnimal) {
            sumOfAgeAllAnimal += animal.ageCalculate();
        }

        System.out.println(sumOfAgeAllAnimal);

        int average = sumOfAgeAllAnimal / allAnimal.size();

        System.out.println(average);

    }
}
