package com.accenture.tdd;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        TddDemo test = new TddDemo();
        System.out.println(test.max(List.of(3, 8, 98, 223, 123, 12, 2)));
        System.out.println(test.maxOfPerson(List.of(

                new Person("Mary", 32),
                new Person("John", 41),
                new Person("Joe", 24)
        )));
    }
}
