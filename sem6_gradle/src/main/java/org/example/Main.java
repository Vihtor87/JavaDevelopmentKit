package org.example;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,6,7,8));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,6,9,8));
        String str = "для примера";

        System.out.println("Реверс " + Lists.reverse(list));
        System.out.println("Получить лист символов из строки  " + Lists.charactersOf(str));
        System.out.println("Разделить лист " + Lists.partition(list, 2));

        System.out.println("Объединение двух коллекций" + Sets.union(Set.copyOf(list), Set.copyOf(list2)));
        System.out.println("Пересечение двух коллекций" + Sets.intersection(Set.copyOf(list), Set.copyOf(list2)));
        System.out.println("Непересекающиеся элементы двух коллекций" + Sets.symmetricDifference(Set.copyOf(list), Set.copyOf(list2)));
    }
}