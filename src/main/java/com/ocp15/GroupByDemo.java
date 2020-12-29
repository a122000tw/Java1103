
package com.ocp15;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

// 群組GroupBy, 數量Count, 排序Sor
public class GroupByDemo {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "banana", "apple", "banana", 
                                             "watermelon", "apple", "orange");
        Map<String, Long> result =  fruits.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(result);
    }
}
