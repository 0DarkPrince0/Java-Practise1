package Practice;

public class Pattern 
{

	
	public static void main(String[] args) 
	{
		int size,i,j,k;
		System.out.println("Enter the pattern size= ");
		size=new java.util.Scanner(System.in).nextInt();
		
		for(i=0;i<size;i++)
		{
			for(j=0;j<size;j++)
			{
				System.out.print("  ");
				
			}
			for(k=0;k<=i;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(i=0;i<=size;i++)
		{
			for(j=size;j>i;j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
