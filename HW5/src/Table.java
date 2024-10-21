import java.util.concurrent.CountDownLatch;

public class Table extends Thread {
    private final int PHIL_COUNT = 5;
    Philosopher[] philosopherList;
    Fork[] forkList;
    private CountDownLatch cdl;

    public Table() {
        forkList = new Fork[PHIL_COUNT];
        philosopherList = new Philosopher[PHIL_COUNT];
        cdl = new CountDownLatch(PHIL_COUNT);
        begin();
    }

    @Override
    public void run() {
        System.out.println("Философы расселись");
        try {
            thingProcess();
            cdl.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Трапеза завершена");
    }

    public synchronized boolean tryGetForks(int leftFork, int righFork) {
        if (!forkList[leftFork].isUding() && !forkList[righFork].isUding()) {
            forkList[leftFork].setUse(true);
            forkList[righFork].setUse(true);
            return true;
        }
        return false;
    }

    public void putForks(int leftFork, int rightFork) {
        forkList[leftFork].setUse(false);
        forkList[rightFork].setUse(false);
    }

    private void begin() {
        for (int i = 0; i < PHIL_COUNT; i++) {
            forkList[i] = new Fork();
        }
        for (int i = 0; i < PHIL_COUNT; i++) {
            philosopherList[i] = new Philosopher("Phil " + i, this,
                    i, (i + 1) % PHIL_COUNT, cdl);
        }
    }

    private void thingProcess() {
        for (Philosopher philosopher : philosopherList) {
            philosopher.start();
        }
    }
}
