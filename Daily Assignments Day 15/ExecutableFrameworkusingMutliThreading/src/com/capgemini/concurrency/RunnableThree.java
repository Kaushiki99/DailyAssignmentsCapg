package com.capgemini.concurrency;

public class RunnableThree implements Runnable {
	@Override
	public void run() {
		while (true) {
			System.out.println("Executing task three");
			try {
				Thread.sleep(1000);
			} catch (Throwable e) {
				e.printStackTrace();
			}
		}
	}
}
