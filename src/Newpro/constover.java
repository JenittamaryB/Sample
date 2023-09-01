package Newpro;

public class constover
	{
	int id;
	String name;
	int age;
	constover(int i,String n)
	{
	id = i;
	name = n;
	}
	constover(int i,String n,int a)
	{
	id = i;
	name = n;
	age=a;
	}
	void display()
	{
	System.out.println(id+" "+name+" "+age);
	}
	public static void main(String args[])
	{
		constover s1 = new constover(111,"jeni");
		constover s2 = new constover(222,"mary",25);
	s1.display();
	s2.display();
	}
}


