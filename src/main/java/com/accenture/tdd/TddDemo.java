package com.accenture.tdd;

import java.util.List;

public class TddDemo {
    public MaxValues max(List<Integer> list) {
        if (list != null && list.size() > 1) {
            int max = 0;
            int secondMax = 0;
            for (int item : list) {
                if (item > max) {
                    max = item;
                }
            }
            for (int item2 : list) {
                if ((item2 > secondMax) && (item2 < max)) {
                    secondMax = item2;
                }
            }
            return new MaxValues(max, secondMax);
        }
        return null;
    }
}
