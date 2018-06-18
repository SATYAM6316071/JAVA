import java.util.Scanner;
class Vowels
{
	public static void main(String[] args)
	{
	    String str1,str2;
	    Scanner sc=new Scanner(System.in);
	    System.out.print("enter any string");
	    str1=sc.nextLine();
	    str2=str1.replaceAll("[aeiouAEIOU]","");
	    System.out.print("vowel removed");
	    System.out.print(str2);
	}
}
