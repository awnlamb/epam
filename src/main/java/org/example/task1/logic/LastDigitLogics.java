package org.example.task1.logic;


public class LastDigitLogics {
    LastDigitLogics(int k) {
    }

    public static int lastSquareDigit(int k) {
        int last = k % 10;
        return last * last % 10;
    }
}
