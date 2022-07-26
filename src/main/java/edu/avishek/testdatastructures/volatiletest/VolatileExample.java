package edu.avishek.testdatastructures.volatiletest;

class VolatileExample extends Thread {
     volatile boolean isRunning = true;
    public void run() {
        long count=0;
        while (isRunning) {
            count++;
        }
        System.out.println("Thread terminated." + count);
    }
    public static void main(String[] args) throws InterruptedException {
        VolatileExample t = new VolatileExample();
        t.start();
        Thread.sleep(2000);
        t.isRunning = false;
        t.join();
        System.out.println("isRunning set to " + t.isRunning);
    }
}
