package Newpro;

public class cpyconst 
	{
	int id;
	String name;
	cpyconst(int i,String n)
	{
	id = i;
	name = n;
	}
	cpyconst(cpyconst s)
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
		cpyconst s1 = new cpyconst(1,"jeni");
		cpyconst s2 = new cpyconst(s1);
	s1.display();
	s2.display();
	}
	}


