package ru.elektr0ni3561.homework5.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Main1 {

    public static void main(String[] args) {
        final List<Integer> list = new ArrayList<>(Arrays.asList(1, 4, 5, 3, 1, 3, 4, 9, 8, 10, 3, 7, 16, 12, 12));

        Integer sum = list.stream()
                .distinct()
                .filter(i -> i % 2 == 0) //Осталвяю только чётные элементы по значению.
                .reduce(0, Integer::sum);

        System.out.println(sum);
    }
}
