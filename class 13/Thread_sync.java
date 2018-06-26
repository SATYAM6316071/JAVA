import java.util.*;
import java.io.*;
class First extends Thread
{
	int i=1;
	public synchronized void run()
	{
		while(i<=500)
		{
			System.out.println(i);
			i++;
		}
	}
}
class Second extends Thread
{
	int i=501;
	public synchronized void run()
	{
		while(i<=1000)
		{
			System.out.println(i);
			i++;
		}
	}
}

class Thread_sync
{
   public static void main(String[] args) throws InterruptedException
  {
	First f=new First();
	Second s=new Second();

	f.start();
	f.join();
	s.start();
  }
}	