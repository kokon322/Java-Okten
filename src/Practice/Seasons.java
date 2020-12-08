package Practice;

import lombok.Getter;
import lombok.Setter;

@Getter

public enum Seasons {
    SPRING(10){
        @Override
        void getDescription() {
            System.out.println("Не понятное время года");
        }
    },
    SUMMER(25){
        @Override
        void getDescription() {
            System.out.println("Жаркое время года");
        }
    },
    AUTUMN(12){
        @Override
        void getDescription() {
            System.out.println("Холодное время года");
        }
    },
    WINTER(-22){
        @Override
        void getDescription() {
            System.out.println("Дико холодное время года");
        }
    };

    private int averageTemperature;

    Seasons(int averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    abstract void getDescription();
}

