package Task;
/*Implement one-many association for Company and Employee.(Make sure to have rating,startYear for Employee)*/

public class Task1Company {
	private String name;

	Task1Company(String name) {
		this.name = name;
	}

	public String getCompanyName() {
		return this.name;

	}
}
