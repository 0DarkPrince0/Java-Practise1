package Practice;

public class Pattern3 {

	
	public static void main(String[] args) 
	{
	int i,j,k,limit,star=1;
	System.out.println("Enter the shape limit=");
	limit=new java.util.Scanner(System.in).nextInt();
	
	for(i=0;i<limit;i++)
	{
		for(j=limit;j>i;j--)
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
		
	star=star-4;
		for(i=0;i<limit;i++)
		{
			for(j=0;j<i+2;j++)
			{
				System.out.print("  ");
			}
			for(k=star;k>0;k--)
			{
				System.out.print("* ");
			}
			star=star-2;
			System.out.println();
		} 
		
	}
	

}
