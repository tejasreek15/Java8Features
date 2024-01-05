package com.example;


import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Example {

    public static void main(String[] args) {

        String input = "javatechie";

        //1. Count the occurrence of each character in a given string
        Map<String, Long> map = Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map);

        //2. Find all duplicate element from a given string
        List<String> collect = Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(data -> data.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println(collect);

        //3. Find first non-repeat element from a given string
        String key = Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(data -> data.getValue() == 1).findFirst().get().getKey();
        System.out.println(key);


        //4. Find second-highest number from given array
        int[] numbers = {5,9,11,2,8,21,1};

        int max = Arrays.stream(numbers).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(max);


        //5. Find longest string from given array
        String[] strArray = {"java", "spring", "springboot", "microservices"};

        String reduce = Arrays.stream(strArray).reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2).get();
        System.out.println(reduce);


        //6. Find all elements from array who starts with 1
        List<String> stringList = Arrays.stream(numbers).boxed().map(s -> s + "").filter(s -> s.startsWith("1")).collect(Collectors.toList());
        System.out.println(stringList);

        //7. String.join method example
        List<String> list = Arrays.asList("1", "2", "3", "4");
        String join = String.join("-", list);
        System.out.println(join);

        //8. Skip and limit method example
        IntStream.range(1, 10).skip(1).limit(8).forEach(System.out::println);

    }



}
