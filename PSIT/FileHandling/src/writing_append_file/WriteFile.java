package writing_append_file;

import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;

public class WriteFile 
{

	private boolean flag=false;
	private String path;
	
	public WriteFile(String path)
	{
		this.path=path;
	}
	public WriteFile(String path,boolean flag)
	{
		this.path=path;
		this.flag=flag;
	}
	public void writeToFile(String text) throws IOException
	{
		FileWriter fw=new FileWriter(path);
		PrintWriter pw=new PrintWriter(fw);
		pw.printf("%s"+"%n", text);
		fw.close();
		pw.close();
		
	}


}
