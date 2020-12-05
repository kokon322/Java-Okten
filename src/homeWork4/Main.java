package homeWork4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        Engine engine = new Engine(250,4);
        Car car = new Car(new Engine(250,4), "BMW",32000,CarType.SEDAN);
        Car car1 = new Car(car.getEngine(), "Volvo",30000,CarType.HATCHBACK);

       
    }
}
