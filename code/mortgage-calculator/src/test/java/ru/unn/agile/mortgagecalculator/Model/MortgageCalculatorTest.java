package ru.unn.agile.mortgagecalculator.Model;

import org.junit.Test;
import ru.unn.agile.mortgagecalculator.model.MortgageCalculator;
import ru.unn.agile.mortgagecalculator.model.PeriodType;

import static org.junit.Assert.*;

public class MortgageCalculatorTest {

    private final double delta = 0.001;

    @Test
    public void canCalculateForOneYearWithoutPayments() {
        MortgageCalculator calculator = new MortgageCalculator();

        double finalAmount = calculator.calculateWithoutPayments(50000, 10, PeriodType.YEAR, 1);

        assertEquals(55000, finalAmount, delta);
    }

    @Test
    public void canCalculateForTwoYearsWithoutPayments() {
        MortgageCalculator calculator = new MortgageCalculator();

        double finalAmount = calculator.calculateWithoutPayments(50000, 10, PeriodType.YEAR, 2);

        assertEquals(60500, finalAmount, delta);
    }

    @Test
    public void canCalculateForThreeYearsWithoutPayments() {
        MortgageCalculator calculator = new MortgageCalculator();

        double finalAmount = calculator.calculateWithoutPayments(50000, 10, PeriodType.YEAR, 3);

        assertEquals(66550, finalAmount, delta);
    }

    @Test
    public void canCalculateForFiveYearsWithoutPayments() {
        MortgageCalculator calculator = new MortgageCalculator();

        double finalAmount = calculator.calculateWithoutPayments(50000, 10, PeriodType.YEAR, 5);

        assertEquals(80525.50, finalAmount, delta);
    }

    @Test
    public void canCalculateForNineYearsWithoutPayments() {
        MortgageCalculator calculator = new MortgageCalculator();

        double finalAmount = calculator.calculateWithoutPayments(50000, 10, PeriodType.YEAR, 9);

        assertEquals(117897.40, finalAmount, delta);
    }

    @Test
    public void canCalculateForTwentyFourYearsWithoutPayments() {
        MortgageCalculator calculator = new MortgageCalculator();

        double finalAmount = calculator.calculateWithoutPayments(50000, 10, PeriodType.YEAR, 24);

        assertEquals(492486.68, finalAmount, delta);
    }

    @Test(expected = IllegalArgumentException.class)
    public void canCalculateForZeroYearWithoutPayments() {
        MortgageCalculator calculator = new MortgageCalculator();

        double finalAmount = calculator.calculateWithoutPayments(50000, 10, PeriodType.YEAR, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void canCalculateForNegativeYearWithoutPayments() {
        MortgageCalculator calculator = new MortgageCalculator();

        double finalAmount = calculator.calculateWithoutPayments(50000, 10, PeriodType.YEAR, -3);
    }


    @Test
    public void canCalculateForOneYearWithDifferentialPayments() {
        MortgageCalculator calculator = new MortgageCalculator();

        double finalAmount = calculator.calculateWithDifferentialPayments(50000, 10, PeriodType.YEAR, 1);

        assertEquals(52708.33, finalAmount, delta);
    }

    @Test
    public void canCalculateForTwoYearsWithDifferentialPayments() {
        MortgageCalculator calculator = new MortgageCalculator();

        double finalAmount = calculator.calculateWithDifferentialPayments(50000, 10, PeriodType.YEAR, 2);

        assertEquals(55208.33, finalAmount, delta);
    }

    @Test
    public void canCalculateForSevenYearsWithDifferentialPayments() {
        MortgageCalculator calculator = new MortgageCalculator();

        double finalAmount = calculator.calculateWithDifferentialPayments(50000, 10, PeriodType.YEAR, 7);

        assertEquals(67708.33, finalAmount, delta);
    }

    @Test(expected = IllegalArgumentException.class)
    public void canCalculateForZeroYearWithDifferentialPayments() {
        MortgageCalculator calculator = new MortgageCalculator();

        double finalAmount = calculator.calculateWithDifferentialPayments(50000, 10, PeriodType.YEAR, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void canCalculateForNegativeYearWithDifferentialPayments() {
        MortgageCalculator calculator = new MortgageCalculator();

        double finalAmount = calculator.calculateWithDifferentialPayments(50000, 10, PeriodType.YEAR, -3);
    }

    @Test
    public void canCalculateForSevenMonthsWithDifferentialPayments() {
        MortgageCalculator calculator = new MortgageCalculator();

        double finalAmount = calculator.calculateWithDifferentialPayments(50000, 10, PeriodType.MONTH, 7);

        assertEquals(51666.67, finalAmount, delta);
    }

    @Test
    public void canCalculateForTwentySevenMonthsWithDifferentialPayments() {
        MortgageCalculator calculator = new MortgageCalculator();

        double finalAmount = calculator.calculateWithDifferentialPayments(50000, 10, PeriodType.MONTH, 27);

        assertEquals(55833.33, finalAmount, delta);
    }

    @Test(expected = IllegalArgumentException.class)
    public void canCalculateForZeroMonthWithDifferentialPayments() {
        MortgageCalculator calculator = new MortgageCalculator();

        double finalAmount = calculator.calculateWithDifferentialPayments(50000, 10, PeriodType.MONTH, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void canCalculateForNegativeMonthWithDifferentialPayments() {
        MortgageCalculator calculator = new MortgageCalculator();

        double finalAmount = calculator.calculateWithDifferentialPayments(50000, 10, PeriodType.MONTH, -3);
    }

}
