package com.example.catfact;

import java.util.ArrayList;
import java.util.List;

public class Random {
    public int sum(int a, int b){
        System.out.println("Inside Sum");
        return a+b;
    }
    public float divide(int a, int b){
        System.out.println("Inside divide");
        return a/b;
    }
    public int multiply(int a, int b){
        System.out.println("Inside multiply");
        return a*b;
    }
    public int subtract(int a, int b){
        System.out.println("Inside subtract");
        return a-b;
    }

    public int[] array(){
        return new int[]{1,2,3,4,5};
    }

    public List<Integer> yoyo(){
        List<Integer> array2 = new ArrayList<>();
        array2.add(1);
        array2.add(2);
        return array2;
    }
}
