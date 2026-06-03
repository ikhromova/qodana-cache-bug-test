package org.example;

public class Main {
    public static void main(String[] args) {
        String s = null;
        // Intentional NPE-risk for Qodana to find
        System.out.println(s.length());
    }
}
// Run 5 trigger
// Run 7 trigger — should get cache HIT via prefix
