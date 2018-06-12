
class Leapyear{
public static void main(String[] abc){
int a=2020;
if(a%4==0 && a%100==0 && a%400==0)
{System.out.println( "a leap year");
}
else{
 System.out.println("not leap year");
}
}
}