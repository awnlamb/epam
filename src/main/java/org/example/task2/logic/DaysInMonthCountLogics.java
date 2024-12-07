package org.example.task2.logic;

public class DaysInMonthCountLogics {
    public static boolean IsLeap(int year)
    {
        if (year%4!=0) return false;
        else {
            if (year%100==0) {
                if (year%400!=0) {
                    return false;
                }
            }
        }
        return true;
    }
    public static int DaysCount(int Month, int year) {
        if (Month == 1 || Month == 3 || Month == 5 || Month == 7 || Month == 8 || Month == 10 || Month == 12) {
            return 31;
        }
        if (Month == 4 || Month == 6 || Month == 9 || Month == 11) {
            return 30;
        }
        if (Month==2) {
            boolean b=IsLeap(year);
            if (b==true)  {
                return 29;
            }
            else {
                return 28;
            }
        }
        return 0;
    }
}
