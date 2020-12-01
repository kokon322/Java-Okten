package homeWork2;

public class Dog extends Animal{

    boolean flea;

    public Dog(String name, int age, String food, String location, boolean flea) {
        super(name, age, food, location);
        this.flea = flea;
    }

    @Override
    public void makeNoise() {
        System.out.println(this.name+ " say GaV");
    }

    @Override
    public String eat() {
        return "Eat this food: " + this.food;
    }
}
