package com.company;

public class MethodTest {
    public static void main(String[] args) {
       int num1 = 10;
       int num2 = 20;

       Calculation calculation = new Calculation(num1 + num2);
       int result = calculation.add(num1, num2);
       System.out.println(result);
}
}

