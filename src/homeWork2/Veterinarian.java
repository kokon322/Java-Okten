package homeWork2;

public class Veterinarian {
    String name;
    int age;

    public Veterinarian(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void treatAnimal(Animal animal){
        System.out.println(animal.name+ " eats: " +animal.getFood());
    }
}
