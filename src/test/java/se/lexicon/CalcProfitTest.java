package se.lexicon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalcProfitTest {


    //Todo - Test that the getProfit method return correct value.

    @Test
    public void test_getProfit_returns_expected_profit(){
        //Arrange
        int costPerUnit = 35;
        int pricePerUnit = 400;
        int stockAmount = 250;

        int expected = 91_250;
        int actual = 0;

        //Act
        actual = CalcProfit.getProfit(costPerUnit,pricePerUnit,stockAmount);

        //Assert
        assertEquals(expected,actual, "Profit expected did not match.");
    }


}
