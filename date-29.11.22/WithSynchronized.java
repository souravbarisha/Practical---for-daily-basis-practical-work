package thread;
class MyThreadClass {
	//void print(int num) { //without synchronized method
		synchronized void print(int num) { ////with synchronized method
	for(int i=1;i<=5;i++) {
		System.out.println(num*i);
		try{
			Thread.sleep(500);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	}
}
class Thread1 extends Thread{
	 MyThreadClass ws;
	 
	 Thread1(MyThreadClass ws){
		 this.ws = ws;
	 }
	 public void run() {
		 ws.print(5);   // 50*1 50*2 ......
	 }
}
class Thread2 extends Thread{
	 MyThreadClass ws;
	 Thread2(MyThreadClass ws){
		 this.ws = ws;
	 }
	 public void run() {
		 ws.print(50);   // 50*1 50*2 ......
	 }
}
public class WithSynchronized {
public static void main(String[] args) {
	 MyThreadClass obj = new  MyThreadClass();
	 Thread t1 = new Thread1(obj);
	 Thread t2 = new Thread2(obj);
	 t1.start();
	 t2.start();
}
}
