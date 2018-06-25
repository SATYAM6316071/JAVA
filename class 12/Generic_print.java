import java.util.*;
public class Generic_print
{
	public static < E > void printArray( E[] inputArray)
	{
		for (E element : inputArray)
		{
			System.out.printf("%s",element);
		}
		System.out.println();
	}
	public static void main(String[] args)
	{
		Integer[] intArray={9,2,4,5,6};
		Double[] doubleArray={3.5,6.2,9.5,5.5,2.8};
		Character[] charArray={'s','a','t','y','a','m'};
		System.out.println("Array integerArray contains:");
            printArray(intArray);   

            System.out.println("\nArray doubleArray contains:");
            printArray(doubleArray);   

            System.out.println("\nArray characterArray contains:");
            printArray(charArray);   
	}
}