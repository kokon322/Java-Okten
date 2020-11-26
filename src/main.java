public class main {

    public static void main(String[] args) {
        User igor = new User(1,25,"Igor","Chernuy", 174,85.0);
        User marina = new User(2,26,"marina","Bilan", 160.22,50.2);
        User artem = new User(3,2,"artem","Chernuy", 77,14.0);
        User larisa = new User(4,55,"larisa","Chernuy", 165,60.0);
        User viktoria = new User(5,48,"viktoria","Berezena", 170,58.0);
        User mariya = new User(6,14,"mariya","Tsurco", 155.3,45.3);
        User sasha = new User(7,15,"sasha","Tsurco", 78,15.0);
        User nastya = new User(8,5,"nastya =","Tsurco", 120,22.0);
//First
        System.out.println(igor.age + marina.age + artem.age);
        System.out.println(igor.height + marina.height + artem.height);
        System.out.println(igor.weight + marina.weight + artem.weight);
//Second
        User [] users = {igor, marina, artem, larisa, viktoria, mariya, sasha,nastya};

        int allAge = 0;
        for (int i = 0; i < users.length; i++) {
            allAge += users[i].age;
        }
        System.out.println(allAge);

        double allWeight = 0;
        for (int i = 0; i < users.length; i++) {
            allWeight += users[i].weight;
        }
        System.out.println(allWeight);

        double allHeight = 0;
        for (int i = 0; i < users.length; i++) {
            allHeight += users[i].height;
        }
        System.out.println(allHeight);
//Third
        Car toyota = new Car(150,1.5,2007,"Toyota", false);
        Car subaru = new Car(176,2.5,2017,"Subaru", true);
        Car jeep = new Car(140,1.8,2012,"Jeep", false);
        Car bmw = new Car(250,3,2015,"BMW", true);
        Car renault = new Car(100,1.2,2020,"Renault", true);

        Car [] cars = {toyota, subaru, jeep, bmw, renault};

        int allYears = 0;
        for (Car car: cars) {
            allYears += car.year;
        }
        System.out.println(allYears);

        double allPowers = 0;
        for (Car car:cars) {
            allPowers += car.power;
        }
        System.out.println(allPowers);
//last
        String y = "";
        int x = 351;
        for (int i = 0; i < 3; i++) {
            if (i == 0){
                y+= x%10;
            }else if (i == 1){
                y+= (x%100)/10;
            }else y+= x/100;

        }
        System.out.println(y);

    }



}
