public class Main {

	public static void main(String[] args) {
		
		Manager Manager = new Manager();
		Manager.runOneThread();
		Manager.runManyThreads();
		Manager.runThreadsData();

		System.exit(0);
	}


}