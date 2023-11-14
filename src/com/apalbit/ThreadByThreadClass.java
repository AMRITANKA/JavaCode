package com.apalbit;

public class ThreadByThreadClass extends Thread{
	
	public ThreadByThreadClass(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("MyThread - START "+Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
            //Get database demo connection,
            doDBConnection();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("MyThread - END "+Thread.currentThread().getName());
    }
    private void doDBConnection() throws InterruptedException {
        Thread.sleep(4000);
    }

}
