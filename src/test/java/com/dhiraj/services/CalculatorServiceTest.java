package com.dhiraj.services;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorServiceTest {

    //test method of addtwo methods
    @Test
    public  void addTwoNumbersTest(){
        int result = CalculatorService.sumAnyNumbers(12, 45);
        int exprected=56;
        Assert.assertEquals(exprected, result);

        //actual result


        //expected result
    }









}
