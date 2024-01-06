package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class RestServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/input.data")
    public void calcRestMonths_shouldReturnCorrectValue(int income, int expenses, int threshold, int expectedRestMonths) {
        RestService restService = new RestService();
        //int income = 100000;
        //int expenses = 60000;
        //int threshold = 150000;
        //int expectedRestMonths = 2;

        int actualRestMonths = restService.calcRestMonths(income, expenses, threshold);
        Assertions.assertEquals(expectedRestMonths, actualRestMonths);
    }
}
