package open_read_file;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

public class ReadFile 
{
	private String path;
	public ReadFile(String file_path)
	{
		path=file_path;
	}
	public String[] openFIle() throws IOException
	{
		FileReader fr=new FileReader(path);
		BufferedReader bf=new BufferedReader(fr);
		int numberOfLines=4,i;
		String textData[]=new String[numberOfLines];
		
		for(i=0;i<textData.length;i++)
		{
			textData[i]=bf.readLine();
		}
		fr.close();
		bf.close();
		return textData;
		
	}
}
