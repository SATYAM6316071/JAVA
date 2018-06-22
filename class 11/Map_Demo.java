import java.util.*;
class Map_Demo
{
	public static void main(String[] args)
	{
		HashMap<String,Double> hash1=  new HashMap<String,Double>();

		hash1.put("satyam",3.5);
		hash1.put("Raipurrani",(6.7));
		hash1.put("piyush",(8.8));
		hash1.put("sajan",(9.9));

		Set set1=hash1.entrySet();

		Iterator itr =set1.iterator();

		while(itr.hasNext())
		{
			Map.Entry map=(Map.Entry)itr.next();
			System.out.print(map.getKey()+":");
			System.out.println(map.getValue()+":");

		}

	}
}