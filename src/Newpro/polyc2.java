package Newpro;

class multiplication{
	void multiply(int a, int b)
	{
		System.out.println("value of Integer:"+a*b);
	}
	void multiply(double a, double b)
	{
		System.out.println("value of Double:"+a*b);
	}
}
public class polyc2 {

	public static void main(String[] args) {
		multiplication m=new multiplication();
		m.multiply(6, 5);
		m.multiply(3.4,4.5);

	}

}
