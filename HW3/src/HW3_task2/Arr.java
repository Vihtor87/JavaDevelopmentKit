package HW3_task2;

/*
* Напишите обобщенный метод compareArrays(), который принимает два массива и возвращает true,
* если они одинаковые, и false в противном случае. Массивы могут быть любого типа данных, но должны
* иметь одинаковую длину и содержать элементы одного типа по парно по индексам.
*/

import java.lang.reflect.Array;

public class Arr {
//    private Array arr[];
//    private Array arr1[];


    public Arr() {}

    public <T> boolean compareArrays(T arr[], T arr1[]) {
        if (arr.length == arr1.length) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].getClass().getName().equals(arr1[i].getClass().getName())) {
                    System.out.println("Массивы одинаковые");
                    return true;
                }
            }
        }
        System.out.println("Массивы разные");
        return false;
    }
}
