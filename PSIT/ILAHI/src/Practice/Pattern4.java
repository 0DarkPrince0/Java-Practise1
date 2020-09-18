package Practice;

public class Pattern4 {


	public static void main(String[] args)
	{
		int len,i,j,number=1,temp,remainder;
		System.out.println("How long pattern do you want to print:-");
		len=new java.util.Scanner(System.in).nextInt();
		for(i=0;i<len;i++)
		{
			for(j=len;j>i;j--)
			{
				System.out.print(" ");
			}
			temp=number;
			while(temp!=0)
			{
			remainder=temp%10;	

			System.out.print(remainder+" ");
			temp=temp/10;
			}
			number=number*11;
			System.out.println();
		}
		
	}

}
