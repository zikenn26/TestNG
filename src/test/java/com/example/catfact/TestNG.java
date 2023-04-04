package com.example.catfact;

import org.junit.jupiter.api.Assertions;
import org.testng.annotations.*;

public class TestNG {
    Random random = new Random();
    int a=20 , b=10;
    @BeforeSuite
    public void beforeSuite()
    {
        System.out.println("The testing suite has started.");
    }

    @AfterSuite
    public void afterSuite()
    {
        System.out.println("The testing suite has ended.");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("Inside before test");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Inside Before Method");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("Inside after test");
    }

    @BeforeMethod
    public int firstVar(){
        return a;
    }

    @BeforeMethod
    public int secondVar(){
        return b;
    }

    @AfterMethod
    public void endTest()
    {
        System.out.println("Inside After Method");
    }

    @Test
    void sum(){
        int expected=30;
        int actual = random.sum(firstVar(),secondVar());
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void multiply(){
        int expected=200;
        int actual = random.multiply(firstVar(),secondVar());
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void subtract(){
        int expected=10;
        int actual = random.subtract(firstVar(),secondVar());
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void divide(){
        float expected=2;
        float actual = random.divide(firstVar(),secondVar());
        Assertions.assertEquals(expected,actual);
    }
}
