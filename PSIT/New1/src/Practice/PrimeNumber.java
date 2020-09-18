package Practice;
import java.util.*;
public class PrimeNumber
{

	
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int number,i,temp=0,duplicate=0;;
		String array[]=new String[10];
		array[0]="Zero";
		array[1]="One";
		array[2]="Two";
		array[3]="Three";
		array[4]="Four";
		array[5]="Five";
		array[6]="Six";
		array[7]="Seven";
		array[8]="Eight";
		array[9]="Nine";
		boolean flag=true;
		System.out.println("Enter the Number:-");
		number=scan.nextInt();
		if(number==0 || number==1)
		{
			flag=false;
			
		}
		for(i=2;i<=number/2;i++)
		{
			if(number%i==0)
			{
				flag=false;
				break;
			}
		}
		if(flag)
		{
			System.out.print("Number is Prime");
			
			while(number!=0)
			{
				duplicate=duplicate*10+number%10;
				number=number/10;
			}
			while(duplicate!=0)
			{
				temp=duplicate%10;
				duplicate=duplicate/10;
				System.out.print(" "+array[temp]);
			}
		}
		else
		{
			System.out.println("Number is not prime");
		}
		
	}

}
