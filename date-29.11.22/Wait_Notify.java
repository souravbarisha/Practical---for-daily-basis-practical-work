package thread;
class A{
	int num;
	boolean valueSet = false;
	public synchronized void put (int num) {
		while(valueSet) {
			try {
				wait();
			}
			catch(Exception e) {}
		}
		System.out.println("Put: "+num);
		this.num = num;
		valueSet = true;
		notify();
	}
	public synchronized void get () {
		while(!valueSet) {
			try {
				wait();
			}
			catch(Exception e) {}
		}
		System.out.println("Get: "+num);
		valueSet = false;
		notify();
	}
	
}
class Producer implements Runnable{
	A a;
	public Producer (A a) {
		this.a = a;
		Thread t1 = new Thread(this, "Producer");
		t1.start();
	}
	public void run() {
		int i = 0;
		while(true) {
			a.put(i++);
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) {}
		}
	}
}
class Consumer implements Runnable{
	A a;
	public Consumer (A a) {
		this.a = a;
		Thread t1 = new Thread(this, "Consumer");
		t1.start();
	}
	public void run() {
		int i = 0;
		while(true) {
			a.get();
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) {}
		}
	}
}
public class Wait_Notify {
public static void main(String[] args) {
	A a = new A();
	new Producer(a);
	new Consumer(a);
}
}
