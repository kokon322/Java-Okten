package Practice;

public enum Seasons {
    SPRING(10){
        @Override
        void getDescription() {
            System.out.println("");
        }
    },
    SUMMER(25){
        @Override
        void getDescription() {
            System.out.println("");
        }
    },
    AUTUMN(12){
        @Override
        void getDescription() {
            System.out.println("");
        }
    },
    WINTER(-22){
        @Override
        void getDescription() {
            System.out.println("");
        }
    };

    private int averageTemperature;

    Seasons(int averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    abstract void getDescription();
}

