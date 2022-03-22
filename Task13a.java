package Task;

import java.io.IOException;

public class Task13a {
	public static void main(String[] args) {
		try {
			MyFile13 myfile=new MyFile13();
			MyFile1 myfile1=new MyFile1();
			myfile.start();
			myfile1.start();
			myfile.setName("Purnima");
			System.out.println(myfile.getName());
			myfile.setPriority(9);
			System.out.println(myfile1.getName());
			myfile1.setPriority(2);
			System.out.println(myfile1.getPriority());
			myfile.join();
			myfile1.join();
			System.out.println(myfile.isAlive());
			System.out.println(myfile1.isAlive());
			System.out.println(myfile.getName());
			System.out.println(myfile1.getName());
		}
		catch(Exception ioe) {
			ioe.printStackTrace();
		}
	}

}
