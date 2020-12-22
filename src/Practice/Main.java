package Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        String one = "Hello World , I am Igor";
//        System.out.println(one.replace(",",""));
//        System.out.println(one.replace("Hel", ""));
//        System.out.println(one.replace("I", " "));
//        System.out.println(one.replace("Hello", "Yo"));
//
//
//        StringBuilder stringBuilder = new StringBuilder("Igor is nice developer");
//        stringBuilder.replace(8,8,"Very ");
//        System.out.println(stringBuilder);

        StringBuffer stringBuffer = new StringBuffer("Hello");
        stringBuffer.append(" ");
        stringBuffer.append("World");
        System.out.println(stringBuffer);
        stringBuffer.append(12);
        stringBuffer.append(new ArrayList<>(Arrays.asList(12,25,5)));
        System.out.println(stringBuffer);
        stringBuffer.delete(11, stringBuffer.length());
        System.out.println(stringBuffer);
        stringBuffer.deleteCharAt(0);
        System.out.println(stringBuffer);
        stringBuffer.insert(0, "H");
        System.out.println(stringBuffer);
        stringBuffer.reverse();
        System.out.println(stringBuffer);
        System.out.println(stringBuffer.substring(1,5));

    }
}
