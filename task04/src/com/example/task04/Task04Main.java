package com.example.task04;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Task04Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        double sum = 0.0;

        while (scanner.hasNext()) {
            String token = scanner.next();
            try {
                double number = Double.parseDouble(token);
                sum += number;
            } catch (NumberFormatException e) {
                // Игнорируем токены, которые не являются числами
            }
        }

        System.out.printf(Locale.ROOT, "%.6f%n", sum);
        scanner.close();
    }
}