import java.util.Scanner;
class Rectangle
{     

int length,breadth,x,y;
int area;
	void setlength(int x)
    {
	 length=x;
    }
	void setbreadth(int y)
	{
	   breadth=y;
	}
		void getarea()
	        {
		 int area=(length*breadth);
		System.out.print(area);
		}
			public static void main(String[] args)
			{
                        	Rectangle obj= new Rectangle();
				obj.setlength(5);
				obj.setbreadth(7);
                         	obj.getarea();
			}
}

		


		
 	