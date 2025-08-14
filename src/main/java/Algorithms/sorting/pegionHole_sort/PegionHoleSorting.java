package Algorithms.sorting.pegionHole_sort;

import org.testng.util.Strings;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PegionHoleSorting {


    public static void main(String[] args){
        int[] arr = {1,12,34,12,56,16,11,111,101};

        List<Integer> lst = Arrays.stream(arr)
                .mapToObj(e -> String.valueOf(e))
                .filter(s -> s.startsWith("1"))
                .map(o -> Integer.parseInt(o))
                .collect(Collectors.toList());
        System.out.println(lst);
    }
}
