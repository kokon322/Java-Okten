package homeWork7;


import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {


    public static void main(String[] args) {

        Book one = new Book("Маленький принц", 2020, 122);
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
        Person artem = new Person(3, "Artem", 2, first);
        Person larysa = new Person(4, "Larysa", 55, third);
        Person victoria = new Person(5, "Victoria", 38, first);
        Person marya = new Person(6, "Marya", 16, second);
        Person anastasia = new Person(7, "Anastasia", 6, third);

        List<Person> allPerson = new ArrayList<>(Arrays.asList(igor, marya, maryna, anastasia, artem, larysa, victoria));


//        1. згенерувати мапу <Person, Integer>, де Integer - кількість сторінок усіх книжок, які має людина
//        getSumOfBooksPages(allPerson).forEach((person, integer) -> System.out.println(person + " : " + integer));
//        2. згенерувати мапу <String, Book>, де String - ім'я людини, Book - книжка з найбільшою кількістю сторінок
//        getBiggestBookOfPerson(allPerson).forEach((s, book) -> System.out.println(s + "  :  " + book));
//        3. згенерувати List<Book> відфільтрувавши тільких тих людей, хто старше 25 років і книжки які мають більше 500 сторінок
        getOldestPerson(allPerson).forEach(System.out::println);


    }


    public static List<Book> getOldestPerson(List<Person> allPerson) {
        return allPerson.stream().filter(person -> person.getAge() > 25)
                .map(person -> person.bookList)
                .flatMap(Collection::stream).filter(book -> book.getPage() > 500).collect(Collectors.toList());
    }


//    public static int pageCount(List<Book> books) {
//        return books.stream().mapToInt(Book::getPage).sum();
//    }
//
//    public static Book getBigBook(List<Book> books) {
//        return books.stream()
//                .reduce((book, book1) -> book.getPage() > book1.getPage() ? book : book1).get();
//    }
//
//
//    public static Map<Person, Integer> getSumOfBooksPages(List<Person> allPerson) {
//        return allPerson.stream().collect(Collectors.toMap(Function.identity(), //or person -> person
//                person -> pageCount(person.bookList)));
//    }
//
//    public static Map<String, Book> getBiggestBookOfPerson(List<Person> allPerson) {
//        return allPerson.stream().collect(Collectors.toMap(Person::getName, person -> getBigBook(person.bookList)));
//    }

    //    public static Map<Person, Integer> page (List<Person> allPerson){
//        Map<Person, Integer> result = new HashMap<>();
//        for (Person person : allPerson) {
//            int pagesOfBook = 0;
//            for (Book book : person.bookList) {
//               pagesOfBook += book.getPage();
//            }
//            result.put(person,pagesOfBook);
//        }
//        return result;


};
