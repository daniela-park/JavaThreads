// Class containing the data (int/double), class to instruct the threads how to edit the data
// Class instantiated in GT1Manager
public class SynchronisedData {
	static long myProtectedInt = 0;

	// Increments the value
	public static synchronized void incrementMyValue() {
		myProtectedInt++;
		System.out.println(Constants.RUN_THREADS_DATA_INCREMENT + myProtectedInt);
		return;
	}
	
	// Decrements the value
	public static synchronized void decrementMyValue() {
		myProtectedInt--;
		System.out.println(Constants.RUN_THREADS_DATA_DECREMENT + myProtectedInt);
		return;
	}
	
	public static long getMyProtectedInt() {
		return myProtectedInt;
	}
}