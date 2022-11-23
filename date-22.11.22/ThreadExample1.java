package thread;

public class ThreadExample1 extends Thread{
public void run() {
	System.out.println("I am Thread... thtread is running");
}
public static void main(String[] args) {
	ThreadExample1 t = new ThreadExample1();
	t.start(); // inovek the run method by this
	//t.setName("sourav"); // if we want to modify the thread name
	String s = t.getName(); // to get thread name
	
	System.out.println(s); // Thread-0 will print , because this is 1st thread
}
}
