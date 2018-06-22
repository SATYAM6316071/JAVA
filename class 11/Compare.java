import java.util.*;
class Compare
{
	public static void main(String[] args)
	{
		HashSet<Integer> h1=new HashSet<Integer>();
		h1.add(3);
		h1.add(8);
		h1.add(1);
		h1.add(6);
		System.out.println("the set is :"+h1);
		HashSet<Integer> h2=new HashSet<Integer>();
		h2.add(5);
		h2.add(4);
		h2.add(2);
		h2.add(8);
		System.out.println("the set is :"+h2);
		h1.retainAll(h2);
		System.out.println("retain element");
		System.out.println(h1);
	}

}	
