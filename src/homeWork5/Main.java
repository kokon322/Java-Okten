package homeWork5;

public class Main {
    public static void main(String[] args) {

        Product tShort = new Product(TypeOfProducts.CLOTH,"Puma","Vinnytsia", 235);
        Product audi = new Product(TypeOfProducts.CAR,"Audi","Berlin", 22000);
        Product kettle = new Product(TypeOfProducts.ELECTRONIC,"Bosch","Ankara", 2000);

        Store store = new Store();

        store.addProductsToStore(tShort);
        store.addProductsToStore(audi);
        store.addProductsToStore(kettle);

        store.deleteProduct("Audi");
        store.deleteProduct("Bosch");
        store.deleteProduct("");
        store.deleteProduct("Puma");
        for (Product product : store.allProducts) {
            System.out.println(product.getName());
        }


    }


}
