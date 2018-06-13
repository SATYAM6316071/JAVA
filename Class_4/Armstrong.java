import java.util.Scanner;
  class Armstrong
{
 	public static void main(String[] args)
        {
		int n,temp,rem,sum=0;
		Scanner scan=new Scanner(System.in);
		System.out.print("enter no");
		n=scan.nextInt();
		
			{
				temp=n;sum=0;
				while(temp>0)
			         {  
					rem=temp%10;
					sum=sum+(rem*rem*rem);
					temp=temp/10;
				 }
						if(n==sum)
							{
							System.out.print("armstrong");
							}
						else
							{
							System.out.print("not armstrong");
			                                }
                       }
	}
}