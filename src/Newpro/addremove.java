package Newpro;
import java.util.ArrayList;
import java.util.Iterator;

public class addremove {
	public static void main(String args[]) 
	{
		ArrayList<String> al=new ArrayList<String>();
		al.add("jeni");
		al.add("mary");
		al.add("reena");
		System.out.println(al);
		al.set(0,"jenitta");//update
		al.remove(2);//delete
		System.out.println(al);
		al.add("joshva");
		al.add("jenittamary");
		System.out.println(al);
		Iterator<String> tr=al.iterator();
		while(tr.hasNext())
		{
			System.out.println(tr.next());
		}
		
	}

}
