package Practice;

public class Palindrome 
{

	public static void main(String[] args)
	{
			int number,num1,num2,duplicate=0;
			System.out.println("Enter the Number:=");
			number=new java.util.Scanner(System.in).nextInt();
			num1=number;
			while(num1!=0)
			{
				num2=num1%10;
				duplicate=duplicate*10+num2;
				num1=num1/10;
			}
			if(number==duplicate)
			{
				System.out.println("Palindrome");
			}
			else
			{
				System.out.println("Not Palindrome");
			}
			
	}

}
