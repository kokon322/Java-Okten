package homeWork5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       User igor = new User(1,"Igor");
       User andriy = new User(2,"Andriy");
       User vasa = new User(3,"Vasa");

        List <User> users = Arrays.asList(igor,andriy,vasa);

        System.out.println(users);
    }
}
