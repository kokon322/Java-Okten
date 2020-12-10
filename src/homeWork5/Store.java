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
            System.out.println("Теперь в нашем магазине есть и такой премиум товар " + x.getName());
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

    public void calculateSumOfType(TypeOfProducts x) {
        int count = 0;
        List<Product> resultList = this.allProducts;
        resultList.addAll(this.primeProduct);
        for (Product product : resultList) {
            if (product.getTypeOfProducts().equals(x))
                count ++;
        }
        System.out.println(count);
    }

    public  void averagePriceOfAllProducts(){
        int count = 0;
        int result = 0;
        List<Product> resultList = this.allProducts;
        resultList.addAll(this.primeProduct);
        for (Product product : resultList) {
            count += product.getPrice();
        }

        result = count / (resultList.size()+1);
        System.out.println(" Средняя стомость товаров в нашем магазине : "+ result);
    }


    @Override
    public String toString() {
        return "Store{" +
                "allProducts=" + allProducts +
                '}';
    }

}
