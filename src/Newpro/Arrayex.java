package Newpro;
import java.util.Arrays;
import java.util.Scanner;


public class Arrayex {
public static void main(String[] args ) {
	int n;
	int arr[]=new int[4];
	Scanner S=new Scanner(System.in);
	System.out.println("Enter the n values:");
	n=S.nextInt();
	for(int i=0;i<n;i++)
	{
		System.out.println("Enter value:");
		arr[i]=S.nextInt();
	}
	System.out.println("value is:");
	for(int i=arr.length-1;i>=0;i--)
	{
		System.out.println(arr[i]);
	}
		
}
}
