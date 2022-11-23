package thread;

public class RunnableInterface implements Runnable{
public void run() {
	System.out.println("I am Thread... thread is running");
}
public static void main(String[] args) {
	RunnableInterface ri = new RunnableInterface();
	Thread t = new Thread(ri); // without thread object we can't invoke the run method
	t.start(); // invoke the run method
	String s = t.getName();
	System.out.println(s);
}
}
