package homeWork7;

import homeWork1.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Person igor = new Person();
        igor.setId(1);
        igor.setName("Igor");

        Person alla = new Person();
        alla.setId(2);
        alla.setName("Alla");

        Person maryna = new Person();
        maryna.setId(3);
        maryna.setName("Maryna");

        Car subaru = new Car(176, 2.5, 2017, "Subaru Outback", true);
        Car bmw = new Car(250, 2.4, 2004, "BMW 320", false);
        Car toyota = new Car(100, 1.5, 2020, "Toyota Auris", true);

//        Predicate<Person> personPredicate = new Predicate<Person>() {
//            @Override
//            public boolean test(Person person) {
//                return person.getName().startsWith("I");
//            }
//        };

//        System.out.println(personPredicate.test(igor));

//        Consumer<Person> personConsumer = new Consumer<Person>() {
//            @Override
//            public void accept(Person person) {
//                System.out.println("id person: " + person.getId() + ", name person: " + person.getName());
//            }
//        };
//
//        personConsumer.accept(maryna);
//
//        Supplier<Person> personSupplier = new Supplier<Person>() {
//            @Override
//            public Person get() {
//                return new Person(2, "Vasa");
//            }
//        };
//
//        personConsumer.accept(personSupplier.get());
//
//        Function<Person, String > personPersonFunction = new Function<Person, String>() {
//            @Override
//            public String apply(Person person) {
//                return person.getId()+ " : "+ person.getName();
//            }
//        };
//
//        System.out.println(personPersonFunction.apply(igor));

//        Predicate<Person> personPredicate = person -> person.getName().startsWith("I");
//
//        Function<Person, String> personStringFunction = person -> person.getId()+ person.getName();
//
//        Function<Person, String> personStringFunction222 = person -> {
//            String s = person.getName() + " "+ person.getId();
//            return s.toUpperCase();
//        };
//
//        Consumer<Person> personConsumer = System.out::println;
//
//        Supplier<Person> personSupplier = () -> new Person(25,"Irina");
//
//        BiFunction<Person, Person, String> personPersonStringBiFunction = (person, person2) -> person.getName() + " "+ person2.getName();


        List<Person> persons = new ArrayList<>(Arrays.asList(igor, maryna, alla));

        //1. Вивести усі елементи на екран//
//        persons.forEach(System.out::println);
        //2. Створити колекцію імен персон//
//        List<String> namePerson = persons.stream()
//                .map(Person::getName)
//                .collect(Collectors.toList());
//        System.out.println(namePerson);
        //3. Помортувати колекцію по айді//
//        List<Person> personSort = persons.stream().sorted((o1, o2) -> o1.getId()-o2.getId()).collect(Collectors.toList());
//        System.out.println(personSort);
        //4. Відфільтрувати у кого ім я починається на "І"//
//       List<Person> personI =  persons.stream().filter(person -> person.getName().startsWith("І")).collect(Collectors.toList());
//       System.out.println(personI);
    }
}