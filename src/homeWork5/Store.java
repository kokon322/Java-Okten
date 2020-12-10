package homeWork5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Store {

    List<Product> allProducts = new ArrayList<>();
    List<Product> primeProduct = new ArrayList<>();

    public void addProductsToStore(Product x) {
        if (x.getPrice() > 0 && x.getPrice() < 3000 && x.getName().matches("[\\p{L}| ]+")) {
            this.allProducts.add(x);
        } else if (x.getPrice() > 0 && x.getPrice() > 3000 && x.getName().matches("[\\p{L}| ]+")) {
            this.primeProduct.add(x);
            System.out.println("Теперь в нашем магазине есть и такой премиум товар "+ x.getName());
        }

    }

    public void deleteProduct(String s) {
        Iterator<Product> iterator = this.allProducts.iterator();
        while (iterator.hasNext()) {
            Product element = iterator.next();
            if (element.getName().equals(s))
                iterator.remove();
        }
    }

    public void uppPrice(TypeOfProducts x) {
        Iterator<Product> iterator = this.allProducts.iterator();
        while (iterator.hasNext()) {
            Product element = iterator.next();
            if (element.getTypeOfProducts().equals(x))
                element.setPrice(element.getPrice() * 2);
        }
    }

    @Override
    public String toString() {
        return "Store{" +
                "allProducts=" + allProducts +
                '}';
    }

}
