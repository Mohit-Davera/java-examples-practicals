package com.simformsolutions.practicals.concurrency;

import java.util.concurrent.*;

//Driver Class Which Creates 5 Threads And ScheduledThreadPool With 10 Threads
public class Main {

	public static void main(String[] args) {
		ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(10);
		
		for(int i =0;i<5;i++)
			scheduledThreadPool.schedule(new Task(),i,TimeUnit.SECONDS);

	}

}
