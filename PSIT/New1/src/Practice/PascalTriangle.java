package Practice;
import java.util.Scanner;
public class PascalTriangle 
{

	
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int i,j,k,len,number;
		System.out.println("Enter the length");
		
		len=scan.nextInt();
		
		
		for(i=0;i<len;i++)
		{
			number=1;
			for(j=len-1;j>=i;j--)
			{
				System.out.print("* ");
			}
			for(k=0;k<=i;k++)
			{
				System.out.print(number+"   ");
				
				number=number*(i-k)/(k+1);
				
			}
			System.out.println();
		}
	}

}
