package ru.geekbrains;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Task005 {
    public static void main(String[] args) {
        File dir = new File("src/main/java/ru/geekbrains/");
        File[] files = dir.listFiles();
        for (File file : files) {
            System.out.println(file);
        }

        File file = new File("src/main/java/ru/geekbrains/file2.txt");
        try (PrintWriter wr = new PrintWriter(file)) {
            for (File file2 : files) {
                wr.println(file2);
            }
            System.out.println("Запись в файл успешно завершена");
        } catch (IOException ex) {
            System.out.println(ex.getLocalizedMessage());
        }

    }
}
