package Practice;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b=0,cube=0;
	
		System.out.println("Enter the First Number= ");
		a=new java.util.Scanner(System.in).nextInt();
		for(int i=0;i<a;i++)
		{
			b=b+a;
		}
		for(int i=0;i<a;i++)
		{
			cube=cube+b;
		}
		System.out.println(cube);
		
		
		
	}

}
