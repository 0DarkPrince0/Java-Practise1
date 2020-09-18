package open_read_file;
import java.io.IOException;
public class FIleData 
{

	
	public static void main(String[] args) throws IOException
	{
		String file_name="D:/a.txt";
		
	
	try
	{
		ReadFile rf=new ReadFile(file_name);
		String [] Line=rf.openFIle();
		int i;
		for(i=0;i<Line.length;i++)
		{
			System.out.println(Line[i]);
		}
	}
	catch(IOException e)
	{
		System.out.println(e);
	}
	}

}
