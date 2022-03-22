package Task;
/*With help of an anonymous inner class, implement any abstract method of the interface. Observe on working of anonymous Inner class here.*/
interface Class{
	abstract void myMethod(int num,String name);
}
class Anonymus implements Class{
	public void myMethod(int num, String name) {
		System.out.println(num+" "+name);
	}
}

public class Task3 {
	public static void main(String[] args) {
		Anonymus obj=new Anonymus();
		obj.myMethod(1,"Purnima");
	}

}
