package org.example.task1.test;


public class LastSquareDigit {
    LastSquareDigit(int k)
    {
    }
    public static int last_square_degree(int k)
    {
        int a=k%10;
        if (a==0) return 0;
        if (a==1||a==9) return 1;
        if (a==2||a==8) return 4;
        if (a==5) return 5;
        if (a==4||a==6) return 6;
        if (a==3||a==7) return 9;
        return 0;
    }
}
