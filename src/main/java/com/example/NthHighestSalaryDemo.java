package com.example;

import java.util.*;
import java.util.stream.Collectors;

public class NthHighestSalaryDemo {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("Deepa", 1000);
        map.put("bhavna", 1800); //o/p
        map.put("micael", 1500);
        map.put("tom", 1900);
        map.put("jerry", 1200);
        map.put("daniel", 1600);
        map.put("james", 1300);

        Map.Entry<String, Integer> result = getNthHighestSalary(2, map);
        System.out.println(result);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("Deepa", 1000);
        map2.put("bhavna", 1200); //o/p
        map2.put("micael", 1000);
        map2.put("tom", 1200);
        map2.put("jerry", 1200);
        map2.put("daniel", 1300);
        map2.put("james", 1300);

        Map.Entry<Integer, List<String>> result1 = getHighestSalary(2, map2);
        System.out.println(result1);
    }

    public static Map.Entry<String, Integer> getNthHighestSalary(int num, Map<String, Integer> map) {
        return map.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).collect(Collectors.toList()).get(num-1);
    }

    public static Map.Entry<Integer, List<String>> getHighestSalary(int num, Map<String, Integer> map) {
        return map.entrySet().stream().collect(Collectors.groupingBy(Map.Entry::getValue,
                Collectors.mapping(Map.Entry::getKey, Collectors.toList())
        )).entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByKey())).collect(Collectors.toList()).get(num-1);
    }
}
