package homeWork7;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Book one = new Book("Маленький принц", 2020, 12);
        Book two = new Book("Коллекционер", 2012, 384);
        Book three = new Book("Портрет Дориана Грея", 2010, 352);
        Book four = new Book("Дон Кихот", 1998, 544);
        Book five = new Book("451' по Фаренгейту", 2010, 320);
        Book six = new Book("Ярмарка тщеславия", 1995, 928);
        Book seven = new Book("Идиот", 2002, 640);

        List<Book> first = new ArrayList<>(Arrays.asList(one, five, three));
        List<Book> second = new ArrayList<>(Arrays.asList(two, six, four));
        List<Book> third = new ArrayList<>(Arrays.asList(seven, six, one));

        Person igor = new Person(1, "Igor", 28, first);
        Person maryna = new Person(2, "Maryna", 26, second);
        Person artem = new Person(3, "Artem", 2, third);
        Person larysa = new Person(4, "Larysa", 55, second);
        Person victoria = new Person(5, "Victoria", 38, third);
        Person marya = new Person(6, "Marya", 16, second);
        Person anastasia = new Person(7, "Anastasia", 6, first);

        List<Person> allPerson = new ArrayList<>(Arrays.asList(igor, marya, maryna, anastasia, artem, larysa, victoria));

        allPerson.forEach(System.out::println);


    }
}