package homeWork5;

public enum TypeOfProducts {
    CAR("Машина", 25000) {
        @Override
        public void SayAboutProductsType() {
            System.out.println(CAR.russianTranslate + " в среднем стоит: " + CAR.averagePrice);
        }
    }, ELECTRONIC("Електроника", 5000) {
        @Override
        public void SayAboutProductsType() {
            System.out.println(ELECTRONIC.russianTranslate + " в стреднем стоит: " + ELECTRONIC.averagePrice);
        }
    }, CLOTH("Одежда", 250) {
        @Override
        public void SayAboutProductsType() {
            System.out.println(CLOTH.russianTranslate + " в среднем стоит: " + CLOTH.averagePrice);
        }
    };

    private String russianTranslate;
    private int averagePrice;

    TypeOfProducts(String russianTranslate, int averagePrice) {
        this.russianTranslate = russianTranslate;
        this.averagePrice = averagePrice;
    }

    public abstract void SayAboutProductsType();

    @Override
    public String toString() {
        return "TypeOfProducts{" +
                "russianTranslate='" + russianTranslate + '\'' +
                ", averagePrice=" + averagePrice +
                "} " + super.toString();
    }

    public String getRussianTranslate() {
        return russianTranslate;
    }

    public int getAveragePrice() {
        return averagePrice;
    }

    public void setRussianTranslate(String russianTranslate) {
        this.russianTranslate = russianTranslate;
    }

    public void setAveragePrice(int averagePrice) {
        this.averagePrice = averagePrice;
    }

}
