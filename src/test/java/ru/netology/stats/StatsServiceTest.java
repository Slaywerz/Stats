package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatsServiceTest {

    @Test
    void sumOfAllMonths() {
        int[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        int actual = service.sum(months);

        int expected = 180;
        assertEquals(expected, actual);
    }

    @Test
    void avgOfAllMonths() {
        int[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        int actual = service.avg(months);

        int expected = 15;
        assertEquals(expected, actual);
    }

    @Test
    void maxMonth() {
        int[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        int actual = service.maxMonths(months);

        int expected = 8;
        assertEquals(expected, actual);
    }

    @Test
    void minMonth() {
        int[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        int actual = service.minMonths(months);

        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    void monthsBelowAvg() {
        int[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        int actual = service.monthsBelowAvg(months);

        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    void monthsAboveAvg() {
        int[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        int actual = service.monthsAboveAvg(months);

        int expected = 5;
        assertEquals(expected, actual);
    }
}