package com.capgemini.concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class MultiTaskExecutor {
	public static void main(String[] args) {
		ArrayBlockingQueue<Runnable> worksQueue = new ArrayBlockingQueue<Runnable>(10);
		RejectedExecutionHandler rejectionHandler = new RejectedExecutionHandlerImpl();
		ThreadPoolExecutor executor = new ThreadPoolExecutor(3, 3, 10, TimeUnit.SECONDS, worksQueue);
		executor.prestartAllCoreThreads();
		
		List<Runnable> taskGroup = new ArrayList<Runnable>();
		taskGroup.add(new RunnableOne());
		taskGroup.add(new RunnableTwo());
		taskGroup.add(new RunnableThree());
		
		worksQueue.add(new MultipleRunnables(taskGroup));
	}
}
