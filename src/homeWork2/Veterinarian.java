package homeWork2;

public class Veterinarian {
    private String name;
    private int age;

    public Veterinarian(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void treatAnimal(Animal animal){
        System.out.println(animal.getName()+ " eats: " +animal.getFood());
    }
}
