package homeWork2;

public class Horse extends Animal {
    String color;

    public Horse(String name, int age, String food, String location, String color) {
        super(name, age, food, location);
        this.color = color;
    }

    @Override
    public void makeNoise() {
        System.out.println(this.getName()+ " say Egogo");
    }

    @Override
    public String eat() {
        this.setFood("seno");
        return this.getFood();
    }
}
