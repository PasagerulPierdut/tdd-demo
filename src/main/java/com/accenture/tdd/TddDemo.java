package com.accenture.tdd;

import java.util.List;

public class TddDemo {
    public static MaxValues max(List<Integer> list) {
        if (list != null && list.size() > 1) {
            int max = Integer.MIN_VALUE;
            int secondMax = Integer.MIN_VALUE;
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

    public static MaxValues2 maxOfPerson(List<Person> personList) {
        if (personList != null && personList.size() > 1) {
            Person max = personList.get(0).compareTo(personList.get(1)) > 0 ? personList.get(0) : personList.get(1);
            Person secondMax = personList.get(0).compareTo(personList.get(1)) > 0 ? personList.get(1) : personList.get(0);
            for (int i = 2; i < personList.size(); i++) {
                Person person = personList.get(i);
                if (person.compareTo(max) > 0) {
                    secondMax = max;
                    max = person;
                } else if (person.compareTo(secondMax) > 0) {
                    secondMax = person;
                }
            }
            return new MaxValues2(max, secondMax);
        }
        return null;
    }
}
