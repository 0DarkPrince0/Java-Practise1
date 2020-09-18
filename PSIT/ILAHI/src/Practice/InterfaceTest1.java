package Practice;

public class InterfaceTest1 {

	
	public static void main(String[] args) {
		Test.i object;
		Test1 t=new Test1();
		t.print();
		object=t;
		object.print();
	}

}
class Test
{
	interface i
	{
		void print();
	}
}

class Test1 implements Test.i
{
	public void print()
	{
		System.out.println("Just for fun");
	}
}