import java.util.ArrayList;
import java.util.Iterator;

// Class to instantiate the Thread objects, start and manage them
public class Manager {

	public void runOneThread() {
		// Creates one instance of Thread
		Thread thread = new Thread();
		System.out.println(Constants.RUN_ONE_THREAD_INSTANCE_STRING);
		
		// Starts the thread, invoking the run() method from GT1Thread
		thread.start();
		
		
		// Sets a "timer" for the manager to sleep and wake up
		try {
			Thread.sleep(Constants.MANAGER_THREAD_SLEEP_TIME);
			System.out.println(Constants.CURRENT_THREAD_NAME_STRING + Constants.SLEEP_STRING);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		// Calls the setExit() method to gt1Thread
		thread.setExit();
		
		// Waits for the thread to finish before leaving the runOneThread() method
		try {
			thread.join();
			System.out.println(thread.getName() + Constants.RUN_ONE_THREAD_JOIN_STRING);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		return;
	}
	
	
	public void runManyThreads() {
		
		int numOfThreads = Constants.RUN_MANY_THREADS_INSTANCES;
		ArrayList<Thread> threadArrayList = new ArrayList<Thread>();
		
		// Creates instances, populates the array and starts the threads
		for (int totalNumOfThreads = 0; totalNumOfThreads < numOfThreads; totalNumOfThreads++) {
			Thread thread = new Thread();
			thread.setName("Thread-" + String.valueOf(totalNumOfThreads + 1));
			threadArrayList.add(thread);
			
			// Starts
			thread.start();
			System.out.println(thread.getName() + Constants.START_STRING);
		}		
		
		// Sets a "timer" for the manager to sleep and wake up
		try {
			Thread.sleep(Constants.MANAGER_THREAD_SLEEP_TIME);
			System.out.println(Constants.CURRENT_THREAD_NAME_STRING + Constants.SLEEP_STRING);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		// Loops through and calls the setxExit() method to the instances of GT1Thread
		for (Thread thread : threadArrayList) {
			thread.setExit();
		}
		
		Iterator<Thread> iterator = threadArrayList.iterator();
		
		// Waits for the instances of GT1Thread to finish before leaving the runManyThreads() method
		while (iterator.hasNext()) {
			Thread thr = iterator.next();
			if (!thr.isAlive()) {
				iterator.remove();
			} else {
				try {
				thr.join();
				iterator.remove();
				} catch (InterruptedException e) {
				e.printStackTrace();
				}
			}
			System.out.println(thr.getName() + Constants.REMOVE_STRING);
		}
		System.out.println(Constants.CURRENT_THREAD_NAME_STRING + Constants.RUN_MANY_THREADS_JOIN_STRING);
		
		return;
	}
	
	
	public void runThreadsData() {
		
		// Instantiates the GT1SynchronisedData class
		SynchronisedData syncData = new SynchronisedData();
		
		int numOfThreadsData = Constants.RUN_THREADS_DATA_INSTANCES;
		ArrayList<Thread> threadArrayList = new ArrayList<Thread>();
		
		// Creates instances, populates the array and starts the threads
		for (int totalNumOfThreads = 0; totalNumOfThreads < numOfThreadsData; totalNumOfThreads++) {
			Thread threads = new Thread();
			threads.setName("Thread-" + String.valueOf(totalNumOfThreads + 1));
			threadArrayList.add(threads);
			threads.setSyncData(syncData);
			
			// Starts
			threads.start();
			System.out.println(threads.getName() + GT1Constants.START_STRING);	
		}
		
		// Sets a "timer" for the manager to sleep and wake up
		try {
			Thread.sleep(Constants.MANAGER_THREAD_SLEEP_TIME);
			System.out.println(Constants.CURRENT_THREAD_NAME_STRING + GT1Constants.SLEEP_STRING);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
			
		// Loops through and calls the setxExit() method to the instances of GT1Thread
		for (Thread thread : threadArrayList) {
			thread.setExit();
		}
		
		Iterator<Thread> iterator = threadArrayList.iterator();
		
		// Waits for the instances of GT1Thread to finish before leaving the runThreadsData() method
		while (iterator.hasNext()) {
			Thread thr = iterator.next();
			if (!thr.isAlive()) {
				iterator.remove();
			} else {
				try {
				thr.join();
				iterator.remove();
				} catch (InterruptedException e) {
				e.printStackTrace();
				}
			}
			System.out.println(thr.getName() + Constants.REMOVE_STRING);
		}
		System.out.println(Constants.CURRENT_THREAD_NAME_STRING + Constants.RUN_THREADS_DATA_JOIN_STRING);

		return;
	}
	
}