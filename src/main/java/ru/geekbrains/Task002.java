package ru.geekbrains;

public class Task002 {
    public static void main(String[] args) {
        String str = "aaaabbbbcddde";
        StringBuilder newStr = new StringBuilder("");
        int count = 0;
        char buf = str.charAt(0);
        newStr.append(buf);
        // a4b4c1d3
        for (int i = 0; i < str.length(); i++) {
            if (buf != str.charAt(i)) {
                if (count > 1) {
                    newStr.append(count);
                }
                buf = str.charAt(i);
                newStr.append(buf);
                count = 1;
            }
            else {
                count++;
            }
        }
        if (count > 1) {
            newStr.append(count);
        }
        System.out.println(newStr);
    }
}
