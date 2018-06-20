import java.io.*;
public class Reader
{
	public static void main(String[] args)throws Exception
	{
	 FileInputStream fis=new FileInputStream("D:\\abc.txt");
	FileOutputStream fos=new FileOutputStream("d:/xyz.txt");
        int i=0;
	while((i=fis.read())!=-1)
	{
	 fos.write((char)i);
	System.out.println((char)i);
	}
      }
}