package org.example;

public class Main {
    public static void main(String[] args) {
        String s = null;
        // Intentional NPE-risk for Qodana to find
        System.out.println(s.length());
    }
}
