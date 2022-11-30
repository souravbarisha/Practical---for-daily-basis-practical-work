package thread;

public class ThreadPriority extends Thread {
	 @Override
	    public void run() {
	        for (int i = 0; i < 5; i++) {
	            try{
	                Thread.sleep(500);
	            }
	            catch (InterruptedException e){
	                System.out.println(e);
	            }
	            System.out.println(i);

	        }
	    }

	    public static void main(String[] args) {
	        ThreadPriority obj1=new ThreadPriority();
	        ThreadPriority obj2=new ThreadPriority();
	        ThreadPriority obj3=new ThreadPriority();
	        obj2.setPriority(MAX_PRIORITY);
	        System.out.println(obj2.getPriority());
	        System.out.println(Thread.currentThread().getName()+ " "+Thread.currentThread().getPriority());
	        obj1.start();
	        obj2.start();
	        obj3.start();
	        obj1.setName("sourav");
	        System.out.println(obj1.getName());
	    }
}
