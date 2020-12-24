package homeWork9;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Створити якийсь файл і наповнити його якимось контентом (лорем іпсум чи якась стаття звідкись, не суть).//
        // Написати клас LineStorage, який матиме String поле.
        // Написати клас ContentReader, який в потоці читатиме вміст файлу і записуватиме кожен рядок в LineStorage обєкт.
        // Написати клас ContentPrinter, який в потоці виводитиме на екран вміст LineStorage.
        // Синхронізувати потоки таким чином, щоб ContentPrinter не виводив один і той же ж рядок декілька разів.

        File file = new File("1.txt");
        List<String> parcer = new ArrayList<>();


        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file));) {

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
