package com.codecool.sum_of_odd_numbers;

import java.util.List;

public class OddNumbers {

    public static Integer sum(List<Integer> numbers) {
        int counter = 0;
        int sum = 0;

        for (Integer number : numbers) {
            if (number % 2 != 0) {
                sum += number;
                counter++;
            }
        }
        if (counter == 0) {
            return 0;
        }
        return sum;
    }
}