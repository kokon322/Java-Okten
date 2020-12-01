package homeWork2;

public class Horse extends Animal {
    String color;

    public Horse(String name, int age, String food, String location, String color) {
        super(name, age, food, location);
        this.color = color;
    }

    @Override
    public void makeNoise() {
        System.out.println(this.name+ " say Egogo");
    }

    @Override
    public String eat() {
        return this.food = "seno";
    }
}
