package com.dhiraj.services;

import org.junit.jupiter.api.*;

public class CalculatorServiceTestJunit5 {
// execute logic before all the testcases
    @BeforeAll
    public static  void init(){
        System.out.println("this is logic execute before all");
    }
   @Test
    public  void addTwoNumbersTest(){
      int actualResult= CalculatorService.addTwoNumber(3,4);
      int expectedResult= 7;
       Assertions.assertEquals(expectedResult,actualResult, "TC001");
       System.out.println("TC001 is passed");
    }
    @Test
    public  void addAnyNumbersTest() {
int actualResult= CalculatorService.sumAnyNumbers(3,4,5,6,1);
int expectedResult=19;
Assertions.assertEquals(expectedResult,actualResult,"TC002");
        System.out.println("TC002 is passed");
    }


    @Test
    public void divideTwoNumbers(){
        double actualResult =CalculatorService.divideTwoNumbers(5,2);
        double expectedResult=2;
        Assertions.assertEquals(expectedResult,actualResult,"TC003");
        System.out.println("TC003 is passed");

    }
    @AfterAll
    public static void cleanUp(){
        System.out.println(" it is executed after all the testcases");
    }
    @BeforeEach
    public  void BeforeachTestCase(){
        System.out.println(" it is executed before each  the testcases");
    }
    @AfterEach
    @Disabled
    public  void AfterEachTestCase(){
        System.out.println(" it is executed after each the testcases");
    }
}
