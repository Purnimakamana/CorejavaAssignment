package Task;
/*A thread has "add" operation,other thread performs"avg" and
other thread performs "display" operation which displays avg and add details after the two threads are compeletely performed.*/
class Adding extends Thread{
static int z;

public void run() {
int x = 30;
int y = 20;
z = x + y;
}
}
class Average extends Thread{
static float r;
public void run() {
float p =26.4f;
float q = 5.2f;
r = (p + q)/2;
}
}
class Display extends Thread{
public void run() {
System.out.println("Adding two number:"+Adding.z);
System.out.println("Average of two numbers:"+Average.r);
}
}
public class Task10 {


public static void main(String[] args) {


Adding ad = new Adding();
Average avg = new Average();
Display dis = new Display();
ad.start();
avg.start();
dis.start();
}


}
