package Newpro;

 class Sport
{
    public void display()
    {
        System.out.println("sports");
    }
}
 interface Badmiton 
{
    public void show1();
}
 interface Cricket 
{
    public void show();
}
public class Hybrid extends Sport implements Badmiton,Cricket
{
	public void show1()
	{
		System.out.println("Badmiton");
	}
    public void show()
    {
        System.out.println("Cricket");
    }
    public void display1()
    {
        System.out.println("Hybrid inheritance");
    }
    public static void main(String args[])
    {
        Hybrid obj = new Hybrid();
        obj.display1();
        obj.show1();
        obj.show();
        obj.display();
        
    }
}



