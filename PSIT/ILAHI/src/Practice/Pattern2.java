package Practice;

public class Pattern2
{

	public static void main(String[] args) 
	{
		int number,i,j,k,star=1;
		System.out.println("How many Row do you want to print:= ");
		number=new java.util.Scanner(System.in).nextInt();
		for(i=0;i<number;i++)
		{
			
			for(j=number;j>i;j--)
			{
				System.out.print("  ");
				
			}
			for(k=0;k<star;k++)
			{
				System.out.print("* ");
			}
			star=star+2;
			System.out.println();
		}
		star=star-2;
		for(i=0;i<number;i++)
		{
			for(j=0;j<i+1;j++)
			{
				System.out.print("  ");
			}
			for(k=0;k<star;k++)
			{
				System.out.print("* ");
			}
			star=star-2;
			System.out.println();
		}
	}

}
