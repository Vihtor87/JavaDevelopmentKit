package HW3_task1;

/*
* Написать класс Калькулятор (необобщенный), который содержит обобщенные статические
* методы: sum(), multiply(), divide(), subtract(). Параметры этих методов – два числа
* разного типа, над которыми должна быть произведена операция. Методы должны возвращать
* результат своей работы.
*/

public class Calc {

    public Calc() {}

    public <T extends Number> double sum(T t, T t1) {
        return t.doubleValue() + t1.doubleValue();
    }

    public <T extends Number> double subtract(T t, T t1) {
        return t.doubleValue() - t1.doubleValue();
    }

    public <T extends Number> double multiply(T t, T t1) {
        return t.doubleValue() * t1.doubleValue();
    }

    public <T extends Number> double divide(T t, T t1) {
        if (t1.doubleValue() != 0) {
            return t.doubleValue() / t1.doubleValue();
        } else {
            throw new NullPointerException("Делить на 0 нельзя!");
        }
    }
}
