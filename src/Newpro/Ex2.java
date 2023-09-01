package Newpro;

 class demo{
	int func(int n)
	{
		int result;
		if(n==1)
			return 1;
		result=func(n-2);
		return result;
	}
}
 public class Ex2{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			 demo obj=new demo();
			System.out.println(obj.func(5));
		
	}

}
