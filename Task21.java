package Task;
import java.util.Scanner;

public class Task21 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		Task21Operation op = new Task21Operation();
		System.out.println("Enter 1 for plus ,2 for minus, 3 for multiple , 4 for divide");
		int i = sc.nextInt();
		if(i == 1||i == 2|| i == 3||i == 4) {
		double t=op.calculate(i, sc.nextDouble(), sc.nextDouble());
		System.out.println(t);
		}
		else {
		try {
		throw new AssertionError("Not Valid");
		}
		catch(AssertionError ae) {
		System.out.println(ae);
		}
	}

}
}
