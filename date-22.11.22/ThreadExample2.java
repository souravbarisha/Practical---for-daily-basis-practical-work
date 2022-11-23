package thread;

public class ThreadExample2 { //we can do thread without extends Thread
public void run() {
	System.out.println("I am Thread.....");
}
	public static void main(String[] args) {
	Thread t = new Thread("Sourav");
	t.start(); // run method is invoke due to there is no extends Thread
	String s = t.getName();
	System.out.println(s);
}
}
