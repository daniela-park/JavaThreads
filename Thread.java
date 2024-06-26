import java.util.Random;

// Class to define the Thread objects, start them, make them sleep, wake up and edit data
public class Thread extends Thread {

	boolean isExiting = false;
	SynchronisedData syncData = null;
	
	public void setSyncData(SynchronisedData syncData) {
		this.syncData = syncData;
		return;
	}
	
	@Override
	// Runs the thread and loops through until isExiting = true
	public void run() {
		System.out.println(this.getName() + Constants.START_STRING);
		int incrementCount = 0;
		int decrementCount = 0;
		Random randomValue = new Random();
		
		while (!isExiting) {
			// Checks if the thread received a data object
			if (syncData != null) {
				// If value is not null, randomly increment/decrement
//				int randomBehaviour = (int) (Math.random() * 10) + 1;
//				double randomBehaviour = Math.random();
				double randomBehaviour = randomValue.nextDouble();
				if (randomBehaviour > 0.5) {
					SynchronisedData.incrementMyValue();
					incrementCount++;
				} else {
					SynchronisedData.decrementMyValue();
					decrementCount++;
				}
			} 
			
			// Sets a "timer" for the thread to sleep and wake up
			try {
				Thread.sleep(Constants.THREAD_SLEEP_TIME);
				System.out.println(this.getName() + Constants.SLEEP_STRING);
			}
			catch (InterruptedException e) {
				System.out.println(this.getName() + Constants.INTERRUPT_STRING);
			}	
		}
		
		System.out.println(Constants.INCREMENT_COUNT_STRING + incrementCount + Constants.DECREMENT_COUNT_STRING + decrementCount);
		
		return;		
	}
	
	// Exits the run() method when isExiting = true
	public void setExit() {
		isExiting = true;
		System.out.println(this.getName() + Constants.EXIT_STRING);
		return;
	}
}
