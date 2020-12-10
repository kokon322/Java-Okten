package homeWork5;

public class Main {
    public static void main(String[] args) {

        Product tShort = new Product(TypeOfProducts.CLOTH,"Puma","Vinnytsia", 235);
        Product dress = new Product(TypeOfProducts.CLOTH,"H&M","Kyiv", 340);
        Product coat = new Product(TypeOfProducts.CLOTH,"Nike","Lviv", 299);
        Product audi = new Product(TypeOfProducts.CAR,"Audi","Berlin", 22000);
        Product rolsRoys = new Product(TypeOfProducts.CAR,"RolsRoys","London", 122000);
        Product toyota = new Product(TypeOfProducts.CAR,"Toyota","Tokyo", 19000);
        Product ford = new Product(TypeOfProducts.CAR,"Ford","New-york", 13000);
        Product kettle = new Product(TypeOfProducts.ELECTRONIC,"Bosch","Ankara", 2000);
        Product refrigerator = new Product(TypeOfProducts.ELECTRONIC,"Samsung","Seul", 12000);
        Product toaster = new Product(TypeOfProducts.ELECTRONIC,"Electrolux","Shanhai", 500);

        Store store = new Store();
//Try methode here.
        store.addProductsToStore(tShort);
        store.addProductsToStore(dress);
        store.addProductsToStore(coat);
        store.addProductsToStore(audi);
        store.addProductsToStore(toyota);
        store.addProductsToStore(ford);
        store.addProductsToStore(kettle);
        store.addProductsToStore(refrigerator);
        store.addProductsToStore(toaster);
        store.addProductsToStore(rolsRoys);


//        store.deleteProduct("Audi");
//        store.deleteProduct("Bosch");
//        store.deleteProduct("");
//        store.deleteProduct("Puma");

//        for (Product product : store.allProducts) {
//            System.out.println(product.getPrice() + " Цена: " + product.getName());
//        }
//        store.uppPrice(TypeOfProducts.CAR);
//        System.out.println();
//        for (Product product : store.allProducts) {
//            System.out.println(product.getPrice() + " Цена: " + product.getName());
//        }
        store.calculateSumOfType(TypeOfProducts.CAR);

    }


}
