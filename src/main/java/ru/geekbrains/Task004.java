package ru.geekbrains;


//public class Task004 {
//    public static void main(String[] args) {
//        String str = "aaaabbbccd";
//        File file = new File("file.txt");
//        BufferedReader br = null;
//        try {
//            br = new BufferedReader(new FileReader(file));
//            br.readLine();
//        } catch (IOException ex) {
//            System.out.println(ex.getLocalizedMessage());
//        } finally {
//            if (br != null) {
//                try {
//                    br.close();
//                } catch (IOException ex) {
//                    System.out.println(ex.getLocalizedMessage());
//                }
//
//            }
//        }
//    }
//}

//public class Task004 {
//    public static void main(String[] args) {
//        String str = "aaaabbbccd";
//        File file = new File("file.txt");
//        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
//            br.readLine();
//        } catch (IOException ex) {
//            System.out.println(ex.getLocalizedMessage());
//        }
//        }
//        try (PrintWriter wr = new PrintWriter(file)) {
//            wr.println("aaa");
//        } catch (IOException ex) {
//            System.out.println(ex.getLocalizedMessage());
//        }
//
//        // Files. ...
//    }
//}

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Task004 {
    public static void main(String[] args) {
        File file = new File("src/main/java/ru/geekbrains/file.txt");
        try (PrintWriter wr = new PrintWriter(file)) {
            wr.println((textMult("Текст", 100)));
            System.out.println("Запись в файл успешно завершена");
        } catch (IOException ex) {
            System.out.println(ex.getLocalizedMessage());
        }
    }

    public static String textMult(String arg, int count) {
        return String.valueOf(arg).repeat(Math.max(0, count));
    }
}


