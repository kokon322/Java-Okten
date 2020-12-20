package homeWork8;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        1. Petro, 28, Kyiv.Pets:1. Tuzik, dog;
//        2. Murca, cat;

//        2. Ira, 19, Lviv.Pets:1. Pikachu, fish;
//        2. Vasya, turtle;

//        3. Nastya, 25, Gaisin.Pets:1. Akula, fish;
//        2. PesSutuluy, dog;

//        3. Maryna, 26, Hutora.Pets:1. Gera, dog;
//        2. Bady, dog;
//
//        Наповнюєте файл відповідно певному формату і згідно з цього формату пишете метод,
//        який розпарсить дані з файлу і створить відповідних Person i Pet.

        File file = new File("1.txt");
        List<Person> personList = new ArrayList<>();
        CustomFileParser parser = new CustomFileParser();
        List<String> strings = parser.readFile(file);


        for (String string : strings) {
            String[] strings1 = parser.parsLine(string);
            Person person = parser.parsePerson(strings1[0]);
            person.setPet(parser.parsePet(strings1[1]));
            personList.add(person);
        }
        personList.forEach(System.out::println);

    }


}
