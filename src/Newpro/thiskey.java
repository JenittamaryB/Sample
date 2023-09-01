package Newpro;

public class thiskey 
	{
	int id;
	String name;
	thiskey (int i,String n)
	{
	id = i;
	name = n;
	}
	thiskey (thiskey s)
	{
	id = s.id;
	name =s.name;
	}
	void display()
	{
	System.out.println(id+" "+name);
	}
	public static void main(String args[])
	{
		thiskey  s1 = new thiskey (111,"Baskar");
		thiskey  s2 = new thiskey (s1);
	s1.display();
	s2.display();
	}
	}


