package homeWork5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Store {

    List<Product> allProducts = new ArrayList<>();

    public void addProductsToStore(Product x){
        if(x.getPrice()>0 && x.getName().matches("[\\p{L}| ]+"))
            this.allProducts.add(x);
    }

    public void deleteProduct(String s){
        Iterator<Product> iterator = this.allProducts.iterator();
        while (iterator.hasNext()){
            Product element = iterator.next();
            if (element.getName().equals(s))
                iterator.remove();
        }
    }

    @Override
    public String toString() {
        return "Store{" +
                "allProducts=" + allProducts +
                '}';
    }

}
