package Task;

public class MyFile13 extends Thread{
	public void run() {
		System.out.println("Good");
		try {
			Thread.sleep(20);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
class MyFile1 extends Thread{
	public void run() {
		System.out.println("Morning");
		try {
			Thread.sleep(20);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}