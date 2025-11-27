package kz.seisen.block8;

import java.util.*;

public class Discounts {
    public static List<int[]> mergeDiscounts(int[][] discounts) {
        // key = day, value = discount in this day
        TreeMap<Integer, Integer> dayDiscount = new TreeMap<>();

        for (int[] d : discounts) {
            int start = d[0];
            int end = d[1];
            int discount = d[2];

            for (int day = start; day <= end; day++) {
                // if we have day already we take max disc
                dayDiscount.put(day, Math.max(dayDiscount.getOrDefault(day, 0), discount));
            }
        }

        List<int[]> result = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : dayDiscount.entrySet()) {
            result.add(new int[]{entry.getKey(), entry.getValue()});
        }

        return result;
    }


}
