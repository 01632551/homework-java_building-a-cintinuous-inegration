package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsServiceTest {

    static StatisticsService service = new StatisticsService();
    @Test
    void shouldFindMax() {

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    void shouldFindMaxWithIncreasingSequenceAndJoker(){
        long[] incomesInBillions = {1, 2, 3, 4, 5, 6, 7, 8, 8, -1292843};
        long expected = 8;
        long actual = service.findMax(incomesInBillions);
        assertEquals(expected, actual);
    }
}