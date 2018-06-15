class Addition
{
	void add(int x,int y)
	{
	  System.out.println("integer");
	}
	     void add(float x,float y)
	       {
		  System.out.println("float");
		}
                       void add(int x, float y)
			{
			  System.out.println("integer and float");
			}
}
class Print
{
   public static void main(String[] args)
	{
          Addition a=new Addition();
	  a.add(3,5);
	  a.add(4.5f,3.9f);
	  a.add(4,3.9f);
 	}
}
