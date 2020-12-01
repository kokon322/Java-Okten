package homeWork2;

public class Cat extends Animal {
    String colorOfEyes;

    public Cat(String name, int age, String food, String location, String colorOfEyes) {
        super(name, age, food, location);
        this.colorOfEyes = colorOfEyes;
    }

    @Override
    public void makeNoise() {
        System.out.println(this.name + " say May");
    }

    @Override
    public String eat() {
        return this.food + " more and more";
    }
}
