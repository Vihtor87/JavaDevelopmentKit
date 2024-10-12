package HW3_task3;

/*
Напишите обобщенный класс Pair, который представляет собой пару значений разного типа.
* Класс должен иметь методы getFirst(), getSecond() для получения значений каждого из составляющих пары,
* а также переопределение метода toString(), возвращающее строковое представление пары.
*/


public class Pair<T extends Integer, V extends String> {

    private T t;
    private V v;

    public Pair(T t, V v) {
        this.t = t;
        this.v = v;
    }

    public T getFirst() {
        return t;
    }

    public V getSecond() {
        return v;
    }

    @Override
    public String toString() {
        return String.format("%s; %s", t, v);
    }
}
