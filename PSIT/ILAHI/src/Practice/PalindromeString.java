package Practice;

public class PalindromeString {


	public static void main(String[] args) 
	{
		String str1,reverse="";
		int length,i;
		System.out.println("Enter string");
		 str1=new java.util.Scanner(System.in).next();
		 length=str1.length();
		 System.out.println(length);
		 for(i=length-1;i>=0;i--)
		 {
			 reverse=reverse+str1.charAt(i);
		 }
		 if(str1.equals(reverse))
		 {
			 System.out.println("String is same");
		 }
		 else
		 {
			 System.out.println("String is not same");
		 }
		 System.out.println(str1);
		 System.out.println(reverse);
	}

}
