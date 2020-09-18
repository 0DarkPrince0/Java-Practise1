package Practice;
import java.util.Scanner;
public class Practice1 
{
	public static void main(String args[])
	{
		String str1,str2="";
		int i,j,count;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the string=");
		str1=scan.nextLine();
		for(i=0;i<str1.length();i++)
		{
			count=0;
			for(j=0;j<str2.length();j++)
			{
				if(str1.charAt(i)==str2.charAt(j))
				{
					count=count+1;
				}
				
			}
			if(count==0)
			{
				str2=str2+str1.charAt(i);
			}
		}
		System.out.println(str2);
	}

}
