import HW3_task1.Calc;
import HW3_task2.Arr;
import HW3_task3.Pair;

public class Main {
    public static void main(String[] args) {

        //task1
//        float a = 1.5f;
//        int b = 12;
//        Calc calc1 = new Calc();
//
//        System.out.println(calc1.sum(a, b));
//        System.out.println(calc1.subtract(a, b));
//        System.out.println(calc1.multiply(a, b));
//        System.out.println(calc1.divide(a, b));

        //task2
//        System.out.println("\n");
//
//        Integer[] a1 = {1, 2, 3};
//        Integer[] a2 = {2, 3, 2};
//        Integer[] a3 = {2, 2};
//
//        String[] b1 = {"значение", "значение1", "значение2"};
//        String[] b2 = {"значение1", "значение2", "значение"};
//        String[] b3 = {"значение", "значение1",};
//
//        Arr ar = new Arr();
//
//        ar.compareArrays(a1, a2);
//        ar.compareArrays(a1, a3);
//        ar.compareArrays(a2, a3);
//        System.out.println("\n");
//
//        ar.compareArrays(b1, b2);
//        ar.compareArrays(b1, b3);
//        ar.compareArrays(b2, b3);
//        System.out.println("\n");
//
//        ar.compareArrays(a1, b1);

        //task2
        System.out.println("\n");

        Pair pair1 = new Pair<>(1, "Бонус");
        Pair pair2 = new Pair<>(2, "Минус");

        System.out.println(pair1.getFirst());
        System.out.println(pair1.getSecond());
        System.out.println("\n");

        System.out.println(pair2.getFirst());
        System.out.println(pair2.getSecond());
        System.out.println("\n");

        System.out.println(pair1);
        System.out.println(pair2);

    }
}