package Practice;
import java.util.Arrays;
public class StringArray 
{


	public static void main(String[] args) 
	{
		String array[]=new String[5];
		array[0]="This";
		array[1]="is";
		array[2]="a";
		array[3]="string";
		array[4]="array";
		
		Arrays.sort(array);
		
		for(int i=0;i<5;i++)
		{
			System.out.println(array[i]);
		}
		
	}

}
