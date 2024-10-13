package worker;

/**
 * Каждый сотрудник должен иметь следующие атрибуты:
 * Табельный номер
 * Номер телефона
 * Имя
 * Стаж
 */

public class Worker {

    private final int tabel;
    private final int phone;
    private final String name;
    private final int stage;

    public Worker(int tabel, int phone, String name, int stage) {
        this.tabel = tabel;
        this.phone = phone;
        this.name = name;
        this.stage = stage;
    }

    public int getTabel() {
        return tabel;
    }

    public int getPhone() {
        return phone;
    }

    public String getName() {
        return name;
    }

    public int getStage() {
        return stage;
    }

    @Override
    public String toString() {
        return String.format("%s; %s; %s; %s", tabel, phone, name, stage);
    }
}
