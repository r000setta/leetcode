package multiThread;

import java.util.concurrent.Semaphore;

public class FooBar {
    private int n;

    private final Semaphore semaphoreA=new Semaphore(0);
    private final Semaphore semaphoreB=new Semaphore(0);
    public FooBar(int n) {
        this.n = n;
    }

    public void foo(Runnable printFoo) throws InterruptedException {
        for (int i = 0; i < n; i++) {
            // printFoo.run() outputs "foo". Do not change or remove this line.
            printFoo.run();
            semaphoreB.release();
            semaphoreA.acquire();
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            semaphoreB.acquire();
            // printBar.run() outputs "bar". Do not change or remove this line.
            printBar.run();
            semaphoreA.release();
        }
    }
}
