package com.stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ForEach {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Miya");
        list.add("Riya");
        list.add("Liya");
        list.add("Roopa");
        list.add("Jaya");

        list.stream().filter(listData -> listData.startsWith("R")).forEach(value -> System.out.println(value));

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");

        map.forEach((k, v) -> System.out.println(k + " : " + v));
        map.entrySet().stream().filter(mapData -> mapData.getKey()%2==0).forEach(Object -> System.out.println(Object));

    }

}
