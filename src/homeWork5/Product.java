package homeWork5;

import java.util.Objects;

public class Product {
    private TypeOfProducts typeOfProducts;
    private String name;
    private String city;
    private int price;

    public Product(TypeOfProducts typeOfProducts, String name, String city, int price) {
        this.typeOfProducts = typeOfProducts;
        this.name = name;
        this.city = city;
        this.price = price;
    }

    public TypeOfProducts getTypeOfProducts() {
        return typeOfProducts;
    }

    public void setTypeOfProducts(TypeOfProducts typeOfProducts) {
        this.typeOfProducts = typeOfProducts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "typeOfProducts=" + typeOfProducts +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return price == product.price && typeOfProducts == product.typeOfProducts && Objects.equals(name, product.name) && Objects.equals(city, product.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeOfProducts, name, city, price);
    }
}
