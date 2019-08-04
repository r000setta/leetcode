package multiThread;

import java.util.concurrent.Semaphore;

public class H2O {

    private Semaphore h=new Semaphore(2);
    private Semaphore o=new Semaphore(2);
    public H2O() {

    }

    public void hydrogen(Runnable releaseHydrogen) throws InterruptedException {
        h.acquire(1);
        releaseHydrogen.run();
        o.release(1);
    }

    public void oxygen(Runnable releaseOxygen) throws InterruptedException {
        o.acquire(2);
        releaseOxygen.run();
        h.release(2);
    }
}
