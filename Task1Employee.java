package Task;

public class Task1Employee {
	private String name;
	private int rating;
	private int startYear;
	Task1Employee(String name,int rating,int startYear ){
		this.name=name;
		this.rating=rating;
		this.startYear=startYear;
	}
	public String getEmployeeName() {
		return this.name;

	}
	public int getrating() {
		return this.rating;

}
	public int getstartYear() {
		return this.startYear;
}
}