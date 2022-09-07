package ru.geekbrains;

public class Task003 {
    public static void main(String[] args) {
        // abcdcba
        String str = "abcdcba";
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                System.out.println("Это не палиндром");
                return;
            }
        }
        System.out.println("Это палиндром");
    }
}
