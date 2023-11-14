package com.apalbit;

public class ThreadByRunnable implements Runnable{

	  @Override
	    public void run() {
	        System.out.println("Doing some tasks - START "+Thread.currentThread().getName());
	        try {
	            Thread.sleep(1000);
	            //Get database demo connection, 
	            doDBConnection();
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	        System.out.println("Doing some tasks - END "+Thread.currentThread().getName());
	    }

	    private void doDBConnection() throws InterruptedException {
	        Thread.sleep(4000);
	    }

}
