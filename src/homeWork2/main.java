package homeWork2;

public class main {
    public static void main(String[] args) {
        Dog bady = new Dog("Bady", 8, "meet", "Vinnitsa", false);
        Cat emelya = new Cat("Yemela",7,"fish","Vinnitsa", "green");
        Horse babel = new Horse("Babel", 12,"yachmen", "Stepanovca", "White");

        Veterinarian vasa = new Veterinarian("Vasa",28);

        Animal [] mas = {bady, babel, emelya};

        for (int i = 0; i < mas.length; i++) {
            vasa.treatAnimal(mas[i]);
        }
    }
}
