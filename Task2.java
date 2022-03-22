package Task;

public class Task2 {
	public static void main(String[] args) {
		Task2Trainee a=new Task2Trainee("Anu","Social");
		Task2Trainee a1=new Task2Trainee("Puja","English");
		Task2StudyMaterial b=new Task2StudyMaterial("Laya",13);
		Task2StudyMaterial b1=new Task2StudyMaterial("Raju",15);
		System.out.println("These are students : " + a.name+" "+a1.name);
		System.out.println("They are Trainees : " + b.name+" "+b1.name);
	}

}
