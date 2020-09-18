package Practice;

public class Table
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int number,i,table;
		System.out.println("Enter number");
		number=new java.util.Scanner(System.in).nextInt();
		Memo d=new Memo();
		d.table(number);
	}
}
	
	 class Memo
	{
		 public void table(int number)
		{ 
			int i,table;
			for(i=1;i<=10;i++)
			{
			table=number*i;
			System.out.println(table);
			}
		}
	}

