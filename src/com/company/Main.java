package com.company;
import java.util.Locale;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("введите “I like Java!!!”");
        Scanner Like = new Scanner(System.in);
        String str = Like.nextLine();
        boolean res1 = str.contains("Java");
        System.out.println("Contains sequence 'Java': " + res1);
        boolean res2 = str.startsWith("I like");
        System.out.println("Starts with “I like”: " + res2);
        boolean res3 = str.endsWith("!!!");
        System.out.println("Ends with “!!!”: " + res3);
        if (res1 == true && res2 == true && res3 == true) {
            System.out.println(str.toUpperCase());
        }
        String res4 = str.replaceAll("a", "o");
        System.out.println(res4.substring(7, 11));
    }
}
