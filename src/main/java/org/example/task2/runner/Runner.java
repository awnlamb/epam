package org.example.task2.runner;

import org.example.scanner.MyScanner;
import org.example.task2.logic.DaysInMonthCountLogics;

public class Runner {
    public static void main(String[] args)
    {
        System.out.println("Введите год и месяц: ");
        int year=MyScanner.enterIntegerFromConsole();
        int month=MyScanner.enterIntegerFromConsole();
        System.out.println("Количество дней в месяце: "+DaysInMonthCountLogics.DaysCount(month,year));
        if (DaysInMonthCountLogics.IsLeap(year)) {
            System.out.println("Год високосный");
        }
        else {
            System.out.println("Год невисокосный");
        }
    }
}
