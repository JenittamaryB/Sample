package Newpro;
interface building
{
	 abstract void display();
}
interface street
{
	 abstract void display1();
}
class address implements building,street
{
	public void display()
	{
		System.out.println("Building.No is: 40");
	}
	public void display1()
	{
		System.out.println("street:ABC");
	}
}
public class Multi {

	public static void main(String[] args) {
		address obj=new address();
		obj.display();
		obj.display1();
	}

}
