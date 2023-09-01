package Newpro;
import java.util.Iterator;
import java.util.Stack;

public class stackdemo {

	public static void main(String[] args) {
		Stack<String> listsk=new Stack<>();
		boolean result=listsk.empty();//empty stack
		System.out.println("Is the stack is empty?:"+result);
		listsk.push("jenitta");
		listsk.push("baskar");
		listsk.push("reena");
		listsk.push("moses");
		listsk.push("joshva");
		listsk.push("joel");
		System.out.println("The stack is:"+listsk);
		Iterator<String>ir=listsk.iterator();
		while(ir.hasNext())
		{
			System.out.println(ir.next());
		}
		boolean result1=listsk.empty();
		System.out.println("Is the stackk is empty?"+result1);
		String Remove=listsk.pop();//remove
		System.out.println("Stack is removed:"+ Remove);
		String firstel=listsk.peek();//first element in the stack
		System.out.println("The first element is:"+firstel);
		int searchingel=listsk.search("moses");//search the element in the stack
		System.out.println("searching element is:"+searchingel);
	}

}
