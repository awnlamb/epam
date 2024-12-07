package org.example.task1.runner;

import org.example.scanner.MyScanner;
import org.example.task1.logic.LastDigitLogics;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        int n = MyScanner.enterIntegerFromConsole();
        int lastSquare = LastDigitLogics.lastSquareDigit(n);
        System.out.print("Последняя цифра квадрата числа: " + lastSquare);
    }
}
