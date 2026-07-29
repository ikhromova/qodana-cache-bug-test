package org.example;

import java.util.List; // unused — fixable by UNUSED_IMPORT (triggers --apply-fixes scenario)

public class Main {
    public static void main(String[] args) {
        String s = null;
        // Intentional NPE-risk for Qodana to find
        System.out.println(s.length());
    }
}
