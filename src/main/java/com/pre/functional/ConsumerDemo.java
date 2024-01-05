package com.pre.functional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

    public static void main(String[] args) {

//        Consumer<Integer> consumer = t -> System.out.println("Consumer: " + t);
//        consumer.accept(10);

          List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
          list.forEach(t -> System.out.println("Print: " + t));
    }
}
