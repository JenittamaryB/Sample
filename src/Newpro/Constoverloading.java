package Newpro;

 class constoverloading1 { 
		private float x;
		private float y;
	 constoverloading1() {
		x = 0.0f;
		y = 0.0f;
		}
		constoverloading1(float x) {
		this.x = x;
		this.y = x;
		}
	  constoverloading1(float x, float y) {
		this.x = x;
		this.y = y;
		}

		public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
		}
		}
public class Constoverloading{
public static void main(String[] args) {
System.out.println(" Constructor Overloading");
constoverloading1 p = new constoverloading1(); 
System.out.println(p);
constoverloading1 p1 = new constoverloading1(14.5f); //single parameter constructor
System.out.println(p1);
constoverloading1 p2 = new constoverloading1(12.5f, 20.50f); //two paramters constructor
System.out.println(p2);
}
}
