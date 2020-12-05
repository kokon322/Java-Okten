package homeWork4;

import homeWork3.Printable;

public enum CarType {
    SEDAN("Седан") {
        @Override
        public void print() {
            System.out.println(this.getUkrainianTranslate() + " paint in red");
        }
    },
    SUV("Кроссовер") {
        @Override
        public void print() {
            System.out.println(this.getUkrainianTranslate() + " paint in yellow");
        }
    },
    HATCHBACK("Хетчбєк") {
        @Override
        public void print() {
            System.out.println(this.getUkrainianTranslate() + " paint in green");
        }
    };

    private String ukrainianTranslate;

    CarType(String ukrainianTranslate) {
        this.ukrainianTranslate = ukrainianTranslate;
    }

    public String getUkrainianTranslate() {
        return ukrainianTranslate;
    }

    public void setUkrainianTranslate(String ukrainianTranslate) {
        this.ukrainianTranslate = ukrainianTranslate;
    }

    abstract void print();
}
