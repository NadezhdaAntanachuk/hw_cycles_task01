package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class RestMonthsNumberTest {

    @ParameterizedTest
    @CsvSource({
            "3, 10,3,20",
            "2, 100,60,150"
    })
    public void testRestMonthsNumber(int expected, int income, int expenses, int threshold) {
    //    int expected = 3;
        int actual;
        RestMonthsNumber service = new RestMonthsNumber();
        actual = service.calcNumber(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }
}
