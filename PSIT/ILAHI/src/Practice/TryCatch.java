package Practice;
import java.util.Scanner;
public class TryCatch 
{

	public static void main(String[] args) 
	{
	Scanner scan=new Scanner(System.in);
	int number1;
	int number2;
	int result;
	try
	{
		number1=scan.nextInt();
		number2=scan.nextInt();
		result=number1/number2;
		System.out.println(result);
	}
	catch(ArithmeticException e)
	{
		System.out.println(e.getMessage());
	}
	scan.close();
	}

}
