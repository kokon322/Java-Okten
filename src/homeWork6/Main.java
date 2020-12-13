package homeWork6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {
    public static void main(String[] args)  {
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
//        Date x = simpleDateFormat.parse("2020-12-12");
//        System.out.println(x);
//        System.out.println(simpleDateFormat.format(x));
//        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("dd/MM/yyyy");
//        System.out.println(simpleDateFormat1.format(x));

//        LocalDate localDate = LocalDate.parse("20/12/2012",DateTimeFormatter.ofPattern("dd/MM/yyyy"));
//        System.out.println(localDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

//        Set<String> stringSet = new TreeSet<>();
//        stringSet.add("first");
//        stringSet.add("second");
//        stringSet.add("third");
//        System.out.println(stringSet);

//        Set<Person> set = new TreeSet<>();
//        set.add(new Person(9,"Maryna",LocalDate.of(1997,12,25)));
//        System.out.println("---------------------------------------------");
//        set.add(new Person(25,"Igor", LocalDate.of(1992,06,07)));
//        System.out.println("---------------------------------------------");
//        set.add(new Person(2,"Artem", LocalDate.of(2019,07,10)));
//        System.out.println("---------------------------------------------");
//        set.add(new Person(2,"Vasil", LocalDate.of(2019,07,10)));
//
//        for (Person person : set) {
//            System.out.println(person);
//        }

        List<Person> list = new ArrayList<>();
        list.add(new Person(9,"Maryna",LocalDate.of(1997,12,25)));
        System.out.println("---------------------------------------------");
        list.add(new Person(25,"Igor", LocalDate.of(1992,6,7)));
        System.out.println("---------------------------------------------");
        list.add(new Person(2,"Artem", LocalDate.of(2019,7,10)));
        System.out.println("---------------------------------------------");
        list.add(new Person(2,"Vasil", LocalDate.of(2019,7,10)));
//        list.sort(new PersonIdComparatoe());

//        list.sort(new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o1.getName().compareTo(o2.getName());
//            }
//        });



        for (Person person : list) {
            System.out.println(person);
        }

    }
}
