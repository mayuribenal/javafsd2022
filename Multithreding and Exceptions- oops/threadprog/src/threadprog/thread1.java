package threadprog;

public class thread1 extends Thread
{
 	public void run()
 	{
  		System.out.println("the thread started running..");
}
 	public static void main( String args[] )
 	{
  		thread1 s = new  thread1();
  		s.start();
 	}
}
