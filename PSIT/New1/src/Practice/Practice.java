package Practice;
import java.util.Scanner;
public class Practice 
{
	static int program(int number)
	{
		if(number==1 || number==0)
		{
			return 1;
		}
		
		else
		{
		return number*program(number-1);
		}
	}

	    public static void main(String args[] )
	    {
	      Scanner scan=new Scanner(System.in);
	      System.out.println("enter the number");
	    int number=scan.nextInt();
	    
	    int ans=program(number);
	    System.out.println(ans);
	    
	    
	    }
	     	    
	}


