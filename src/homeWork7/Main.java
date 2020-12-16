package homeWork7;

import java.util.function.*;

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

        Predicate<Person> personPredicate = person -> person.getName().startsWith("I");
        Function<Person, String> personStringFunction = person -> person.getId()+ person.getName();
        Consumer<Person> personConsumer = person -> System.out.println(person.getId() + " name: " + person.getName());
        BiFunction<Person, Person, String> personPersonStringBiFunction = (person, person2) -> person.getName() + " "+ person2.getName();


    }
}