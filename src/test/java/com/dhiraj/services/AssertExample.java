package com.dhiraj.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertExample {
    @Test
    public  void test1(){
        System.out.println("Testing some assertion methods");

  int actual =12;
  int expected=12;
        Assertions.assertEquals(expected,actual);

int []act={ 1,2,3,4,5,6};
        int []exp={ 1,2,3,4,5,6};

        Assertions.assertArrayEquals(exp,act);
    }
}
