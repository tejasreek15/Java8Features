package com.streamsort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sort {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(89);
        list.add(36);
        list.add(52);
        list.add(18);

        Collections.sort(list);
        System.out.println(list);

        //List<Integer> listData = list.stream().collect(Collections.sort(list)

        list.stream().sorted(Comparator.reverseOrder()).forEach(listData -> System.out.println(listData));
    }
}
