package com.cons1.SemesterExam5th;

class ThreadA_Z implements Runnable {
    Thread t;

    ThreadA_Z() {
        t = new Thread(this);
        t.start();
    }

    public void run() {
        try {
            for (char i = 'A'; i <= 'Z'; i++) {
                System.out.println(i);
                Thread.sleep(500);
            }
        } catch (Exception e) {
            System.out.println(" Thread interrupted.");
        }
        System.out.println("Thread exiting.");
    }
}
