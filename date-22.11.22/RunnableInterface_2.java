package thread;
// Thread (Runnable obj, string name)
public class RunnableInterface_2 implements Runnable {
	public void run() {
		System.out.println("I am Thread ... running");
	}
public static void main(String[] args) {
	Runnable ri = new RunnableInterface_2();
	Thread t = new Thread(ri,"String name");
	t.start();
	String s = t.getName();
	System.out.println(s);
}
}
