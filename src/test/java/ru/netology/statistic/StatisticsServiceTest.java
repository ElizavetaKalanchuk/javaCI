package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

public class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxWithAllEqualValues() {
        StatisticsService service = new StatisticsService();

        long[] incomes = {10, 10, 10, 10};
        long expected = 10;

        long actual = service.findMax(incomes);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxWithNegativeValues() {
        StatisticsService service = new StatisticsService();

        long[] incomes = {-5, -3, -8, -1, -10};
        long expected = -1;

        long actual = service.findMax(incomes);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxWithSingleValue() {
        StatisticsService service = new StatisticsService();

        long[] incomes = {7};
        long expected = 7;

        long actual = service.findMax(incomes);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxWithMaxAtBeginning() {
        StatisticsService service = new StatisticsService();

        long[] incomes = {15, 3, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 15;

        long actual = service.findMax(incomes);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxWithMaxAtEnd() {
        StatisticsService service = new StatisticsService();

        long[] incomes = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 15};
        long expected = 15;

        long actual = service.findMax(incomes);

        Assertions.assertEquals(expected, actual);
    }
}