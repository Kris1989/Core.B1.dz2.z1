package ru.kristinak.HW;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        ArrayList<Integer> finalList = new ArrayList<>();

        for (int number : intList) {
            if (number > 0 && number % 2 == 0) {
                finalList.add(number);
            }
        }
        Collections.sort(finalList);
        for (Integer s : finalList) {
            System.out.println(s);
        }
    }
}
