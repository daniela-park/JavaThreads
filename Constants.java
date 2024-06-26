public class GT1Constants {
	//General integers:
	public static final int THREAD_SLEEP_TIME = 1000;
	public static final int MANAGER_THREAD_SLEEP_TIME = 5000;
	
	// General strings:
	public static final String START_STRING = " started!";
	public static final String CURRENT_THREAD_NAME_STRING = Thread.currentThread().getName();
	public static final String SLEEP_STRING = " slept and just woke up...";
	public static final String INTERRUPT_STRING = " has been interrupted!";
	public static final String REMOVE_STRING = " is not alive and was removed from the list";
	public static final String EXIT_STRING = " is exiting!";
	
	// runOneThread() constants:
	public static final String RUN_ONE_THREAD_INSTANCE_STRING = "Thread in runOneThread() created!";
	public static final String RUN_ONE_THREAD_STRING = "Current thread in runOneThread(): ";
	public static final String RUN_ONE_THREAD_JOIN_STRING = " closed and left the runOneThread() method!";
	
	// runManyThreads() constants:
	public static final int RUN_MANY_THREADS_INSTANCES = 5;
	public static final String RUN_MANY_THREADS_INSTANCE_STRING = "Threads in runManyThreads() created and started!";
	public static final String RUN_MANY_THREADS_ARRAY_STRING = "Current thread in runManyThreads(): ";
	public static final String RUN_MANY_THREADS_JOIN_STRING = " closed and left the runManyThreads() method!";
	
	// runThreadsData() constants:
	public static final int RUN_THREADS_DATA_INSTANCES = 5;
	public static final String RUN_THREADS_DATA_INSTANCE_STRING = "Threads in runThreadsData() created and started!";
	public static final String RUN_THREADS_DATA_ARRAY_STRING = "Current thread in runThreadsData(): ";
	public static final String RUN_THREADS_DATA_INCREMENT = "Incrementing value! Modified value is ";
	public static final String RUN_THREADS_DATA_DECREMENT = "Decrementing value! Modified value is ";
	public static final String RUN_THREADS_DATA_JOIN_STRING = " closed and left the runThreadsData() method!";
	public static final String INCREMENT_COUNT_STRING = "Increment count: ";
	public static final String DECREMENT_COUNT_STRING = " - Decrement count: ";
	
}