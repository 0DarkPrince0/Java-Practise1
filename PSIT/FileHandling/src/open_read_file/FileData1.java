package open_read_file;
import java.io.IOException;

public class FileData1 {

	
	public static void main(String[] args) 
	{
		String str="D:/a.txt";
		try
		{
			ReadFile1 rf=new ReadFile1(str);
			String []array=rf.open();
			for(int i=0;i<array.length;i++)
			{
				System.out.println(array[i]);
			}
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}

}
