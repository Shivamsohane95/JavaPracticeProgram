package practice;

public class Threading extends Thread {

	public static void main(String[] args) {
		Threading th = new Threading();
		th.start();

	}


	public void run() {
		
		System.out.println("thread is running");
	}

}
