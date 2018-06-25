import java.util.*;
class Date
{
	public static HashMap<String,String> date=new HashMap<String,String>();
	public static HashMap<String,String> month=new HashMap<String,String>();
	public static HashMap<String,String> yearL=new HashMap<String,String>();
	public static HashMap<String,String> yearR=new HashMap<String,String>();
	public static void getDate()
	{
		date.put("1","first");
		date.put("02","second");
		date.put("3","third");
		date.put("4","fourth");
		date.put("5","fifth");
		date.put("6","sixth");
		date.put("7","seventh");
		date.put("8","eight");
		date.put("9","ninth");
		date.put("10","tenth");
		date.put("11","eleventh");
		date.put("12","twelveth");
		date.put("13","thireenth");
		date.put("14","fortheenth");
		date.put("15","fifteenth");
		date.put("16","sixtheenth");
		date.put("17","seventeenth");
		date.put("18","eighteenth");
		date.put("19","nineteenth");
		date.put("20","twenty");
		date.put("21","twenty one");
		date.put("22","twenty two");
		date.put("23","twenty three");
		date.put("24","twenty four");
		date.put("25","twenty five");
		date.put("26","twenty six");
		date.put("27","twenty seven");
		date.put("28","twenty eigth");
		date.put("29","twenty nine");
		date.put("30","thirty");
		date.put("31","thirty first");
		month.put("1","january");
		month.put("2","febraury");
		month.put("3","march");
		month.put("4","april");
		month.put("5","may");
		month.put("6","june");
		month.put("7","july");
		month.put("8","august");
		month.put("9","september");
		month.put("10","october");
		month.put("11","november");
		month.put("12","december");
		yearL.put("17","seventeen");
		yearL.put("18","eighteen");
		yearL.put("19","nineteen");
		yearL.put("20","twenty");
		yearL.put("21","twenty one");
		yearL.put("22","twenty two");
		yearR.put("00","hundred");
		yearR.put("10","ten");
		yearR.put("20","twenty");
		yearR.put("30","thirty");
	}
	public static String change(String di)
	{
		String d=di.substring(0,2);
		String m=di.substring(3,5);
		String yl=di.substring(6,8);
		String yr=di.substring(8,10);
		return date.get(d)+" "+month.get(m)+" "+yearL.get(yl)+" "+yearR.get(yr);
	}
	public static void main(String[] args)
	{
		getDate();
		System.out.println("02-12-2010");
		System.out.println(change("02-12-2010"));

	}
	
}