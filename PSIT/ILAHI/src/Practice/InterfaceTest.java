package Practice;


public class InterfaceTest implements Remo.print
{
	public void show()
	{
		System.out.println("Override");
	}
	
	public static void main(String[] args) 
	{
		
		InterfaceTest it=new InterfaceTest();
		it.show();
	}

}
class Remo
{
	interface print
	{
	void show();
	}
}