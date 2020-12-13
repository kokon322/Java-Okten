package homeWork6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws ParseException {
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

        Set<Person> set = new TreeSet<>();
        set.add(new Person(9,"Maryna",LocalDate.of(1997,12,25)));
        set.add(new Person(25,"Igor", LocalDate.of(1992,06,07)));
        set.add(new Person(2,"Artem", LocalDate.of(2019,07,10)));
        set.add(new Person(2,"Vasa", LocalDate.of(2019,07,10)));

        for (Person person : set) {
            System.out.println(person);
        }

    }
}
