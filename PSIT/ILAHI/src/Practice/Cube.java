package Practice;

public class Cube extends Exception
{ 

	
	public static void main(String[] args) 
	{
		char ch;
		do
		{
			try
			{
				int number,i,cube=0,temp=0;
		
				System.out.println("Enter the Number= ");
				number=new java.util.Scanner(System.in).nextInt();
		
		
				if(number==0)
				{
					System.out.println("Cube= 0");
				}
				else
				{
					for(i=0;i<number;i++)
					{
						temp=temp+number;
					}
					for(i=0;i<number;i++)
					{
						cube=cube+temp;
					}
				}
				System.out.print("Cube= "+cube);
			}
			catch(Exception e)
			{	
			System.out.println();
			 System.out.println(e);
			 System.out.println("\nPlease Enter Numbers only");
			 System.out.println("\n\n");
			}
			System.out.println("\nDo you want to continue  ");
			System.out.println("For Yes Press Y for No enter enter key");
			ch=new java.util.Scanner(System.in).next().charAt(0);
		}
		while(ch=='Y' || ch=='y');
		
	
	
	}
	

}
