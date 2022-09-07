package ru.geekbrains;

public class Task001 {
    public static void main(String[] args) {
        int n = 5;
        char c1 = 'a';
        char c2 = 'b';
        // abab
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n/2; i++) {
            result.append(c1);
            result.append(c2);
        }
        System.out.println(result);
    }
}
