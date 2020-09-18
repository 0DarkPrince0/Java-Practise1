package Practice;
import java.util.*;
public class ForEach 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int array[]=new int[5],k=0;
		System.out.println("Enter the Numbers");
		
		for(int i=0;i<array.length;i++)
		{
			array[i]=scan.nextInt();
		}
		for(int i : array)
		{
			k=k+i;

			System.out.println(k);
		}
		//for(int i=0;i<array.length;i++)
	//	{
		//System.out.println(k);
	//	}
	}

}
