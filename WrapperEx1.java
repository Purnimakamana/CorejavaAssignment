package stringcj9;

public class WrapperEx1 {
	public static void main(String[] args) {
		int a=10;
		Integer i=Integer.valueOf(a);//explicitily
		Integer j=a;
		System.out.println(a+" "+i+" "+j);
	}

}
