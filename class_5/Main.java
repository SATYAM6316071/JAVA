class Test
{
	static 
		{
		 
			System.out.println("static called");
		}
       Test()
	{System.out.println("constracter called");
	}
}
 public class Main
    {
      	public static void main(String[] args)
    	    {
		System.out.println("main is called");
	Test s=new Test();
           }
   }

