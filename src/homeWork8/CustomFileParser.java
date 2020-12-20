package homeWork8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CustomFileParser {
    public static final String REPLACEMENT = "";

    public List<String> readFile(File file) {
        List<String> parseList = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String s = null;
            while ((s = bufferedReader.readLine()) != null) {
                parseList.add(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return parseList;
    }

    public String[] parsLine(String line) {
        return line.split("Pets: ");
    }

    public Person parsePerson(String line) {
        String[] firstPerson = line.split(" ");
        Person person = new Person();
        person.setId(Integer.parseInt(firstPerson[0].replace(".", REPLACEMENT)));
        person.setName(firstPerson[1].replace(",", REPLACEMENT));
        person.setAge(Integer.parseInt(firstPerson[2].replace(",", REPLACEMENT)));
        person.setCity(firstPerson[3].replace(".", REPLACEMENT));
        return person;
    }

    public List<Pet> parsePet(String line) {
        String[] splitedLine = line.split("; ");
        List<Pet> petList = new ArrayList<>();
        for (String s : splitedLine) {
            String[] result = s.split(" ");
            Pet pet = new Pet();
            pet.setId(Integer.parseInt(result[0].replace(".", REPLACEMENT)));
            pet.setName(result[1].replace(",", REPLACEMENT));
            pet.setType(result[2]);
            petList.add(pet);
        }
        return petList;
    }
}