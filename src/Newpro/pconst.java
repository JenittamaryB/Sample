package Newpro;

public class pconst {
	int id;
	String name;
	pconst(int i,String n)
	{
	id = i;
	name = n;
	}
	void display()
	{
	System.out.println(id+" "+name);
	}
	public static void main(String args[])
	{
	pconst s1 = new 	pconst(111,"jeni");
	pconst s2 = new 	pconst(222,"mary");
	s1.display();
	s2.display();
	}
}

