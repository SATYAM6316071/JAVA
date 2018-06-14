import java.util.Scanner;
class Complex                                              
{
	int real,imag,x,y;
		int display;
		void setreal(int x)
		{
		  real=x;
		}
		void setimag(int y)
		{
		   imag=y;
		}
			void getdisplay()
			{
				System.out.print(real+"+"+imag+"j");
			}
				public static void main(String[] args)
			{
				Complex obj=new Complex();
				obj.setreal(2);
				obj.setimag(5);
				obj.getdisplay();
			}
}
		
