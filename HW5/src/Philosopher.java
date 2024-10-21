import java.util.Random;
import java.util.concurrent.CountDownLatch;

public class Philosopher extends Thread {

    private String name;
    private int leftFork;
    private int rightFork;
    private int countEatPhil;
    private CountDownLatch cdl;
    private Table table;
    private Random ran;

    public Philosopher(String name, Table table, int leftFork, int rightFork, CountDownLatch cdl) {
        this.table = table;
        this.name = name;
        this.leftFork = leftFork;
        this.rightFork = rightFork;
        this.cdl = cdl;
        countEatPhil = 0;
        ran = new Random();
    }

    @Override
    public void run() {
        while (countEatPhil < 3) {
            try {
                thinking();
                eating();
            } catch (InterruptedException e) {
                e.fillInStackTrace();
            }
        }
        System.out.println(name + " наелся");
        cdl.countDown();
    }

    private void eating() throws InterruptedException {
        if (table.tryGetForks(leftFork, rightFork)) {
            System.out.println(name + " использует " + leftFork + " и " + rightFork);
            sleep(ran.nextInt(3000, 6500));
            table.putForks(leftFork, rightFork);
            System.out.println(name + " поел, вилки " + leftFork + " и " + rightFork + " помыл");
            countEatPhil++;
        }
    }

    private void thinking() throws InterruptedException {
        sleep(ran.nextInt(300, 2500));
    }
}
