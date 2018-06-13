import java.util.Scanner;
class Prime
{
	public static void main(String[] args)
	{	
		int i,n,count=0;
		Scanner scan=new Scanner(System.in);
		System.out.print("enter a no:");
		n=scan.nextInt();
		
		for(i=2;i<n;i++)
		
			{
				if(n%i==0)
					{
					count++;
					}
			}
			
		
		if(count==0)
		{
			System.out.println("prime");
		}
		else
		{
			System.out.println("not prime");
		}	
	}
		
}