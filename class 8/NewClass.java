import java.io.FileInputStream;
public class NewClass
{
public static void main(String args[]) throws Exception
{
	  FileInputStream fin=new FileInputStream("D:\\");
	  int i=0;
	while((i=fin.read())!=-1)
	{
	  System.out.print((char)i);
	}
}
}