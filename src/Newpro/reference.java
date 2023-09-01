package Newpro;

public class reference {
	int x=10;
	int display()
	{
		System.out.println("x="+x);
		return 0;
	}
public static void main(String[] args )
{
	reference obj=new reference();
	System.out.println(obj);
	System.out.println(obj.display());
}

}
