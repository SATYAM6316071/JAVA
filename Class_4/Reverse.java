import java.util.Scanner;
class Reverse
{
	public static void main(String[] args)
		{
		  int b,rev=0,n;
		  Scanner scan=new Scanner(System.in);
		  System.out.print("Enter no :");
		n=scan.nextInt();
		while (n > 0)
			{
				b = n % 10;
				rev = rev * 10 + b;
				n = n / 10;
			}
			
				System.out.print(rev);
			
		}
		
}