import java.util.*;
class Specific
{
	public static void main(String[] args)
	{
		HashMap<String,Double> hash1=new HashMap<String,Double>();

		hash1.put("satyam",new Double(3));
		hash1.put("Raipurrani",new Double(6));
		hash1.put("piyush",new Double(8));
		hash1.put("sajan",new Double(9));

		Set set1=hash1.entrySet();

		Iterator itr =set1.iterator();

		while(itr.hasNext())
		{
			Map.Entry map=(Map.Entry)itr.next();
			System.out.println(map.getKey()+":");
			System.out.println(map.getValue()+":");

		}

	}
}