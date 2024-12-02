package org.example.task1.runner;

import org.example.task1.test.LastSquareDigit;
import org.example.MyScanner;

public class Runner {
    public static void main(String[] args)
    {
        System.out.println("Введите число: ");
        int n=MyScanner.enterIntegerFromConsole();
        int last_square=LastSquareDigit.last_square_degree(n);
        System.out.print("Последняя цифра квадрата числа: "+n);
    }
}
