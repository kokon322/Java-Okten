package Practice;

public class Main {
    public static void main(String[] args) {
        String one = "Hello World , I am Igor";
        System.out.println(one.replace(",",""));
        System.out.println(one.replace("Hel", ""));
        System.out.println(one.replace("I", " "));
        System.out.println(one.replace("Hello", "Yo"));


        StringBuilder stringBuilder = new StringBuilder("Igor is nice developer");
        stringBuilder.replace(8,8,"Very ");
        System.out.println(stringBuilder);
    }
}
