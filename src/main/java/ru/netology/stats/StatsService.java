package ru.netology.stats;

public class StatsService {
    public int sum(int[] months) {
        int sum = 0;
        for ( int month : months ) {
            sum += month;
        }
        return sum;
    }

    public int avg(int[] months) {
        int sum = sum(months);
        return sum / months.length;
    }

    public int maxMonths(int[] months) {
        int max = months[0];
        for ( int month : months ) {
            if (month > max) {
                max = month;
            }
        }
        int min = months[0];
        for ( int month : months ) {
            if (month < min) {
                min = month;
            }
        }

        int monthNumber = 0;
        int monthMax = 0;
        for ( int month : months ) {
            monthNumber++;
            if (month == max) {
                monthMax = monthNumber;
            }
        }
        return monthMax;
    }


    public int minMonths(int[] months) {
        int min = months[0];
        for ( int month : months ) {
            if (month < min) {
                min = month;
            }
        }

        int monthNumber = 0;
        int monthMin = 0;
        for ( int month : months ) {
            monthNumber++;
            if (month == min) {
                monthMin = monthNumber;
            }

        }
        return monthMin;
    }

    public int monthsBelowAvg(int[] months) {
        int belowAvg = 0;

        int avg = avg(months);

        for ( int month : months ) {
            if (month < avg) {
                belowAvg++;
            }
        }
        return belowAvg;
    }

    public int monthsAboveAvg(int[] months) {
        int aboveAvg = 0;

        int avg = avg(months);
        for ( int month : months ) {
            if (month > avg) {
                aboveAvg++;
            }
        }
        return aboveAvg;
    }
}

