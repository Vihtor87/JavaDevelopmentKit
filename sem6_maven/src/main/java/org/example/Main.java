package org.example;


import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;
import org.apache.commons.math3.util.ArithmeticUtils;

public class Main {
    public static void main(String[] args) {
        double[] arr = {1,2,3,4,5,6,7,8,9,19};
        DescriptiveStatistics descriptiveStatistics = new DescriptiveStatistics(arr);

//        System.out.println("минимальное значение " + descriptiveStatistics.getMin());
//        System.out.println("максимальное значение " + descriptiveStatistics.getMax());
//        System.out.println("сумма значений массива " + descriptiveStatistics.getSum());
//        System.out.println("среднее арифметическое значение " + descriptiveStatistics.getMean());

        System.out.println("Факториал числа " + ArithmeticUtils.factorial(9));
        System.out.println("Наименьшее общее частное двух чисел " + ArithmeticUtils.lcm(5, 15));
        System.out.println("Наибольший делитель двух чисел " + ArithmeticUtils.gcd(10, 30));
        System.out.println("Проверить что число 16 это степень двойки " + ArithmeticUtils.isPowerOfTwo(16));
    }
}