package open_read_file;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
public class ReadFile1 
{
private String path;
ReadFile1(String file_path)
{
	path=file_path;
}
int readLines( ) throws IOException
{
	FileReader fr=new FileReader(path);
	BufferedReader br=new BufferedReader(fr);
	String str;
	int numberOfLines=0;
	while((str=br.readLine())!=null)
	{
		numberOfLines++;
		
	}
	fr.close();
	br.close();
	return numberOfLines;
}
public String[] open() throws IOException
{
	FileReader fr=new FileReader(path);
	BufferedReader br=new BufferedReader(fr);
	int length=readLines();
	int i;
	String array[]=new String[length];
	for(i=0;i<array.length;i++)
	{
		array[i]=br.readLine();
	}
	fr.close();
	br.close();
	return array;
	
}
}
