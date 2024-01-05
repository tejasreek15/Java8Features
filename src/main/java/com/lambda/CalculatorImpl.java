package com.lambda;

interface Calculator {

    //void switchOn();

    //void value(int x);

    int add(int a, int b);
}

public class CalculatorImpl{

    public static void main(String args[]) {

//        Calculator calculator = () -> System.out.println("Switch On...");
//        calculator.switchOn();

//        Calculator calculator = (x) -> System.out.println("x value is : " + x);
//        calculator.value(10);

        Calculator calculator = (a, b) -> {
            if(a > b) {
                throw new RuntimeException("a is greater");
            } else {
                return a + b;
            }
        };


        System.out.println(calculator.add(8, 31));


    }
}
