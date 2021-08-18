package nextDay;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {


    @Test
    void test1() {
        int day = 1;
        int month = 1;
        int year = 2018;
        String expected = "02/01/2018";

        String result = NextDayCalculator.getNextDay(day, month, year);
        assertEquals(expected, result);
    }

    @Test
    void test2() {
        int day = 31;
        int month = 1;
        int year = 2018;
        String expected = "01/02/2018";

        String result = NextDayCalculator.getNextDay(day, month, year);
        assertEquals(expected, result);
    }

    @Test
    void test3() {
        int day = 30;
        int month = 4;
        int year = 2018;
        String expected = "01/05/2018";

        String result = NextDayCalculator.getNextDay(day, month, year);
        assertEquals(expected, result);
    }

    @Test
    void test4() {
        int day = 28;
        int month = 2;
        int year = 2018;
        String expected = "01/03/2018";

        String result = NextDayCalculator.getNextDay(day, month, year);
        assertEquals(expected, result);
    }

    @Test
    void test5() {
        int day = 29;
        int month = 2;
        int year = 2020;
        String expected = "01/03/2020";

        String result = NextDayCalculator.getNextDay(day, month, year);
        assertEquals(expected, result);
    }

    @Test
    void test6() {
        int day = 31;
        int month = 12;
        int year = 2018;
        String expected = "01/01/2019";

        String result = NextDayCalculator.getNextDay(day, month, year);
        assertEquals(expected, result);
    }
}