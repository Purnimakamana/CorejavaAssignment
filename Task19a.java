package Task;
/* Implement an exception "InvalidUserName".
User inputs his UserName in console. When length of userName is <10 or if it has "&", this should be handled by the exception.*/
public class Task19a {
	class InvalidUserName extends Exception{
		public InvalidUserName(String s) {
		super(s);
		}
	}

}
