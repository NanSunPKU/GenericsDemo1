package com.company.generics;

public class Utils {
    public static <T extends Comparable<T>> T max(T first, T second) {
        return first.compareTo(second) < 0 ? second: first;
    }

    public static <K, V> void print(K key, V value) {
        System.out.println(key + "=" + value);
    }

    public static void printUser(User user) {
        System.out.println(user);
    }

    //class CAP#1 extends User {}
    //class Instructor extends User {}
    //but capture class can not be assigned as Instructor object
    //such as Instructor x = users.get(0)
    public static void printUsers(GenericList<? super User> users) {
        Object x = users.get(0);
        users.add(new Instructor(10));

    }
}
