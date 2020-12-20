package homeWork8;


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
//
//        1. Petro, 24, 12-12-1996, Lviv. Pets:
//        1. Tuzik, dog;
//        2. Murka, cat;
//        2. Ira, 18, 05-04-2002, Kyiv: Pets:
//        3. Pikachu, fish;
//        4. Kakashka, turtle;
//
//        Наповнюєте файл відповідно певному формату і згідно з цього формату пишете метод,
//        який розпарсить дані з файлу і створить відповідних Person i Pet

        File file = new File("1.txt");

        List<String> parseList = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String s = null;
            while ((s = bufferedReader.readLine()) != null) {
                parseList.add(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        String[] firstPerson = parseList.get(0).split(" ");
        Person petro = new Person();
        petro.setId(Integer.parseInt(firstPerson[0].replace(".","")));
        petro.setName(firstPerson[1].replace(",",""));
        petro.setAge(Integer.parseInt(firstPerson[2].replace(",","")));
        petro.setCity(firstPerson[3].replace(".",""));

        System.out.println(firstPerson[8]);
        Pet tuzik = new Pet();
        tuzik.setId(Integer.parseInt(firstPerson[5].replace(".","")));
        tuzik.setName(firstPerson[6].replace(",",""));
        tuzik.setType(firstPerson[7].replace(";",""));
        Pet murca = new Pet();
        murca.setId(Integer.parseInt(firstPerson[8].replace(".","")));
        murca.setName(firstPerson[9].replace(",",""));
        murca.setType(firstPerson[10].replace(";",""));

        List <Pet> petushary = new ArrayList<>();

    }


}
