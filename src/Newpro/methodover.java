package Newpro;

 class methodover1 {

		public static int addition(int a, int b) {
		return a + b;
		}
		public static float addition(float a, float b) {
		return a + b;
		}
		public static float addition(int a, float b) {
		return a + b;
		}
		public static float addition(float a, int b) {
		return a + b;
		}
		public static String addition(String a, String b) {
		return a + b;
		}
		}
		
		public class methodover {
		public static void main(String[] args) {
		
		System.out.println(" Method Overloading ");
		System.out.println("Addition of two integers : " +
		methodover1.addition(10, 20));
		System.out.println("Addition of two floating numbers :" +
				methodover1.addition(10.0f, 20.f));
		System.out.println("Addition of one integer and one float :" +
				methodover1.addition(10, 20.0f));
		System.out.println("Addition of one float and one integer :" +
				methodover1.addition(10.0f, 20));
		System.out.println("Addition of two Strings : " +
				methodover1.addition("Hello ", "World"));
				}
}

