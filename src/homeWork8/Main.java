package homeWork8;


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
//        int x = 2 + 2;
//        int[] arr = new int[5];
//        Object a = null;


//        try {
//            a.toString();
////            System.out.println(arr[6]);
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("______________________________________");
//            System.out.println("Catch: ArrayIndexOutOfBoundsException");
//            System.out.println("______________________________________");
//        } catch (NullPointerException e) {
//            System.out.println("______________________________________");
//            System.out.println("Catch: NullPointerException");
//            System.out.println("______________________________________");
//        } finally {
//            System.out.println("Finally");
//        }

//        try {
//            myMethod();
//        } catch (MyException e) {
//            System.out.println(e.getVeryDetailMessage());
//        }
//
//
//    }
//    public static void myMethod() throws MyException{
//        List<String> list = new ArrayList<>();
//        if (list.isEmpty()){
//            throw new MyException("Empty list", "I DONT LIKE EMPTY LIST");
//        }
//    }
        File file = new File("1.txt");

//        try (FileOutputStream fileOutputStream = new FileOutputStream(file,true)) { // try with resurces;
//            fileOutputStream.write("Hello World!".getBytes());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        try (FileInputStream fileInputStream = new FileInputStream(file)) {
//            int i = 0;
//            String s = new String();
//            while ((i = fileInputStream.read()) != -1){
//                System.out.println((char) i);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        try (FileReader fileReader = new FileReader(file);) {
//            int i = 0;
//            while ((i = fileReader.read()) != -1) {
//                System.out.println((char) i);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


//        try (PrintWriter printWriter = new PrintWriter(new FileWriter(file, true))) {
//            printWriter.write("Hello malatko ");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
////            String s;
////            while ((s = bufferedReader.readLine()) != null) {
////                System.out.println(s);
////            }
//            bufferedReader.lines().forEach(System.out::println);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

    }


}
