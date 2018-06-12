public class Reverse
{

	public static void main(String[] args) 
	{
		int  b, rev = 0;
		int n=1234;
		
			while (n > 0)
			{
				b = n % 10;
				rev = rev * 10 + b;
				n = n / 10;
			}
			
				System.out.print(rev);
			
		}
		
	}

