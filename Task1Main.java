package Task;

public class Task1Main {
	public static void main(String[] args) {
		Task1Company company=new Task1Company("Techouts");
		Task1Employee emp=new Task1Employee("purnima",10,2022);
		Task1Employee emp1=new Task1Employee("Vani",9,2022);
		System.out.println((emp.getEmployeeName()+" "+emp.getrating()+" "+emp.getstartYear()+ " is employee of " + company.getCompanyName()));
		System.out.println((emp1.getEmployeeName()+" "+emp1.getrating()+" "+emp1.getstartYear()+ " is employee of  " + company.getCompanyName()));
	}

}
