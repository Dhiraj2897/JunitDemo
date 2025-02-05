package com.dhiraj.services;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Date;

public class CalculatorServiceTest {


    @BeforeClass
    public static void init(){
        System.out.println("before all the testcase:");
        System.out.println("Started test :"+ new Date());
    }
    //test method of addtwo methods
    @Test
    public  void addTwoNumbersTest(){
        int result = CalculatorService.sumAnyNumbers(12, 45);
        int exprected=57;
        Assert.assertEquals(exprected, result);
        System.out.println("TC001 is passed ");


    }
@Test
   public void sumAnyNumbersTest(){
       int result =   CalculatorService.sumAnyNumbers(3,5,3,3,5);
        int expectedResult=19;
        Assert.assertEquals(expectedResult, result);

            System.out.println("TC002 is passed");

   }
   @AfterClass
   public static void cleanUp(){
       System.out.println("after all testcases");
       System.out.println("End test cases :"+new Date());
   }







}
