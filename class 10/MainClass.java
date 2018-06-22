import java.io.File;
 
public class MainClass
{
    public static void main(String[] args) 
    
    {
    	String storage="";
        File f = new File("C:\\Users\\mahadev\\Desktop\\training\\list of files");
         
        File[] files = f.listFiles();
         
        for (File file : files) 
        {
            System.out.println(file.getPath());
            storage+=file.getPath()+",";
			if(file.isDirectory())
			{
			 File[] files1=file.listFiles();
	
	         for(File file2 : files1)
	           {
	             System.out.println(file2.getPath());
	                 storage+=file.getPath()+",";
                }
                     System.out.println(storage);
            }
        }
    }
}
