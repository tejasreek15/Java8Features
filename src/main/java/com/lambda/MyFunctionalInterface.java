package com.lambda;

@FunctionalInterface
public interface MyFunctionalInterface {

    void m1();

    default void m2() {
        System.out.println("m2");
    }

}
