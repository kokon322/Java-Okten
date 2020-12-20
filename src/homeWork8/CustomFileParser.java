package homeWork8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CustomFileParser {
    public static final String REPLACEMENT = "";
    public static final String SPACE = " ";
    public static final String DOT = ".";
    public static final String COMMA = ",";

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
        String[] firstPerson = line.split(SPACE);
        Person person = new Person();
        person.setId(Integer.parseInt(firstPerson[0].replace(DOT, REPLACEMENT)));
        person.setName(firstPerson[1].replace(",", REPLACEMENT));
        person.setAge(Integer.parseInt(firstPerson[2].replace(COMMA, REPLACEMENT)));
        person.setCity(firstPerson[3].replace(DOT, REPLACEMENT));
        return person;
    }

    public List<Pet> parsePet(String line) {
        String[] splitedLine = line.split("; ");
        List<Pet> petList = new ArrayList<>();
        for (String s : splitedLine) {
            String[] result = s.split(SPACE);
            Pet pet = new Pet();
            pet.setId(Integer.parseInt(result[0].replace(DOT, REPLACEMENT)));
            pet.setName(result[1].replace(COMMA, REPLACEMENT));
            pet.setType(result[2]);
            petList.add(pet);
        }
        return petList;
    }
}