import bookWorkers.BooksWorkers;
import worker.Worker;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Worker worker1 = new Worker(12, 7643, "Федя", 3);
        Worker worker2 = new Worker(14, 613, "Кира", 4);
        Worker worker3 = new Worker(11, 734, "Семён", 4);
        Worker worker4 = new Worker(10, 641, "Саша", 2);
        BooksWorkers booksWorkers1 = new BooksWorkers();
        booksWorkers1.addWorker(worker1);
        booksWorkers1.addWorker(worker2);
        booksWorkers1.addWorker(worker3);
        booksWorkers1.addWorker(worker4);

        System.out.println(booksWorkers1.findWorkerByStage(4));
        System.out.println(booksWorkers1.findPhoneWorkerByName("Кира"));
        System.out.println(booksWorkers1.findWorkerByTabel(12));
    }
}