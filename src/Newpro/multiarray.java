package Newpro;
import java.util.Scanner;
import java.util.Arrays;

public class multiarray {
public static void main(String args[])
{
	int n;
	Scanner S=new Scanner(System.in);
	System.out.println("Enter the value");
	n=S.nextInt();
	int b[][]=new int[n][n];
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			System.out.println("Enter the value ");
			b[i][j]=S.nextInt();
			
		}
	}
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			System.out.println(b[i][j]);
			System.out.println("\t");
			
			
		}
		System.out.println("\n");
	
	}
}
}
