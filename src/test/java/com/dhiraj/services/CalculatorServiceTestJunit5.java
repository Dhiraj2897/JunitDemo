package com.dhiraj.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorServiceTestJunit5 {

   @Test
    public  void addTwoNumbersTest(){
      int actualResult= CalculatorService.addTwoNumber(3,4);
      int expectedResult= 7;
       Assertions.assertEquals(expectedResult,actualResult, "TC001");
    }
    @Test
    public  void addAnyNumbersTest() {
int actualResult= CalculatorService.sumAnyNumbers(3,4,5,6,1);
int expectedResult=19;
Assertions.assertEquals(expectedResult,actualResult,"TC002");
    }


    @Test
    public void divideTwoNumbers(){
        double actualResult =CalculatorService.divideTwoNumbers(5,2);
        double expectedResult=3;
        Assertions.assertEquals(expectedResult,actualResult,"TC003");

    }
}
