class ReverseExample
{
   public static void main(String[] args)
	{
          String str="satyam raj";
	  String reverse=reverseString(str);
	  System.out.println("The reverse String is: " + reverse);
	}
   public static String reverseString(String str)
    {
	if(str.isEmpty())
	return str;
	return reverseString(str.substring(1))+str.charAt(0);
    }
}
