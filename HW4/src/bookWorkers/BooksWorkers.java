package bookWorkers;

import worker.Worker;

import java.util.*;

/**
 * Создать справочник сотрудников
 * Необходимо:
 * Создать класс справочник сотрудников, который содержит внутри
 * коллекцию сотрудников - каждый сотрудник должен иметь следующие атрибуты:
 * Табельный номер
 * Номер телефона
 * Имя
 * Стаж
 * Добавить метод добавления нового сотрудника в справочник
 * Добавить метод, который ищет сотрудника по стажу (может быть список)
 * Добавить метод, который возвращает номер телефона сотрудника по имени (может быть список)
 * Добавить метод, который ищет сотрудника по табельному номеру
 */

public class BooksWorkers {

    private final List<Worker> listWorkers;

    public BooksWorkers() {
        this.listWorkers = new ArrayList<>();
    }

    public void addWorker(Worker worker) {
        listWorkers.add(worker);
    }

    public Map<String, Integer> findWorkerByStage(int stageSearch) {
        Map<String, Integer> resSearch = new HashMap<>();
        for (Worker worker : listWorkers) {
            if (worker.getStage() == stageSearch) {
                resSearch.put(worker.getName(), stageSearch);
            }
        }
        System.out.println("Сотрудник = стаж");
        return resSearch;
    }

    public Map<String, Integer> findPhoneWorkerByName(String stageSearch) {
        Map<String, Integer> resSearch = new HashMap<>();
        for (Worker worker : listWorkers) {
            if (worker.getName().equals(stageSearch)) {
                resSearch.put(stageSearch, worker.getPhone());
            }
        }
        System.out.println("Сотрудник = номер телефона");
        return resSearch;
    }

    public Map<String, Integer> findWorkerByTabel(int stageSearch) {
        Map<String, Integer> resSearch = new HashMap<>();
        for (Worker worker : listWorkers) {
            if (worker.getTabel() == stageSearch) {
                resSearch.put(worker.getName(), stageSearch);
            }
        }
        System.out.println("Сотрудник = табель");
        return resSearch;
    }
}
