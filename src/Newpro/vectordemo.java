package Newpro;
import java.util.Iterator;
import java.util.Vector;

public class vectordemo {

	public static void main(String[] args) {
		Vector<Integer>v=new Vector<>();
		v.add(100);
		v.add(200);
		v.add(300);
		v.add(400);
		v.add(100);
		v.add(200);
		v.add(600);
		System.out.println("size of the vector:"+v.size());
		System.out.println("Capacity of the vector:"+v.capacity());
		Iterator<Integer> ir=v.iterator();
		while(ir.hasNext())
		{
			System.out.println(ir.next());
			
		}
		//add some vector element
		v.add(200);
		v.add(360);
		v.add(500);
		System.out.println("now the size of vector:"+v.size());
		System.out.println("now the capacity of vector:"+v.capacity());
		//check if the vector is there or not by contain() method
		if(v.contains(360))
		{
			System.out.println("360 is on the vector:"+v.indexOf(360));
			
		}
		else
		{
			System.out.println("vector 200 is not in the element");
		}
       //get the first element in the vector
		System.out.println("first element in the vector is:"+v.firstElement());
		//get the last element in the vector
		System.out.println("last element in the vector is:"+v.lastElement());
		//Remove first occurence in the element
		System.out.println("Remove the element in the element"+v.remove((Integer)200));
	    //display the vector
		System.out.println("vector is"+v);
		//Hashcode of the vector 
		System.out.println("Hash code of the vector is:"+v.hashCode());
		//get the element at specified index
		System.out.println("element of index is:"+v.get(6));
	}

}
