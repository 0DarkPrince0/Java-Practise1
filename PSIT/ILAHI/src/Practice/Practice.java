package Practice;
import java.util.Scanner;
public class Practice
{

	
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		String str1,str2="";
		int i,j,count;
		System.out.println("Please enter the Line:-");
		str1=scan.nextLine();
		
		for(i=0;i<str1.length();i++)
		{
			count=0;
			for(j=0;j<str2.length();j++)
			{
				if(str1.charAt(i)==str2.charAt(j))
				{
					count++;
				}
				else
				{
					continue;
				}
			}
		
			if(count==0)
			{
				str2=str2+str1.charAt(i);
			}
		}
		System.out.println("Unique characters of this line are="+str2);
		
		for(j=0;j<str2.length();j++)
		{
			count=0;
			for(i=0;i<str1.length();i++)
			{
				if(str2.charAt(j)==str1.charAt(i))
				{
					count++;
				}
				else
				{
					continue;
				}
			}
			if(count==1)
			{
			System.out.println("Character "+str2.charAt(j)+" = "+count+" time");
			}
			else
			{
				System.out.println("Character "+str2.charAt(j)+" = "+count+" times");
			}
		}
	}
		

}
