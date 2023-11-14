package com.apalbit;

public class ThreadDemo {

	public static void main(String[] args) {

		Thread t1 = new Thread(new ThreadByRunnable(), "t1");
        Thread t2 = new Thread(new ThreadByRunnable(), "t2");
        System.out.println("Starting ThreadByRunnable threads");
        t1.start();
        t2.start();
        System.out.println("Runnable ThreadByRunnable has been started");
        
        Thread t3 = new ThreadByThreadClass("t3");
        Thread t4 = new ThreadByThreadClass("t4");
        System.out.println("Starting ThreadByThreadClass");
        t3.start();
        t4.start();
        System.out.println("ThreadByThreadClass has been started");

	}

}
