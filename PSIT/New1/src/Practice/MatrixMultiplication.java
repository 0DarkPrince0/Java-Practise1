package Practice;
import java.util.Scanner;
public class MatrixMultiplication
{

	
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int row,colomn,i,j,k;
		System.out.println("Enter Row and Colomn size=");
		row=scan.nextInt();
		colomn=scan.nextInt();
		
		int matrix1[][]=new int[row][colomn],matrix2[][]=new int[row][colomn],matrix3[][]=new int[row][colomn];
		System.out.println("Enter first matrix1 elements=");
		
		for(i=0;i<row;i++)
		{
			for(j=0;j<colomn;j++)
			{
				System.out.println("Enter Matrix1 "+"i"+(i+1)+" "+"j"+(j+1)+ " element");
				matrix1[i][j]=scan.nextInt();
				
			}
		}
		for(i=0;i<row;i++)
		{
			for(j=0;j<colomn;j++)
			{
				System.out.print(matrix1[i][j]+"  ");
				
				
			}
			System.out.println();
		}
System.out.println("Enter matrix2 elements=");
		
		for(i=0;i<row;i++)
		{
			for(j=0;j<colomn;j++)
			{
				System.out.println("Enter Matrix2 "+"i"+(i+1)+" "+"j"+(j+1)+ " element");
				matrix2[i][j]=scan.nextInt();
				
			}
		}
		for(i=0;i<row;i++)
		{
			for(j=0;j<colomn;j++)
			{
				System.out.print(matrix2[i][j]+"  ");
				
				
			}
			System.out.println();
		}
		
		System.out.println("_____________________________________________________________________________________________");
		for(i=0;i<row;i++)
		{
			for(j=0;j<colomn;j++)
			{
				matrix3[i][j]=0;
				for(k=0;k<colomn;k++)
				{

					matrix3[i][j]=matrix3[i][j]+matrix1[i][k]*matrix2[k][j];
				}
				System.out.print(matrix3[i][j]+"  ");
			}
			System.out.println();
		}
	}

}
