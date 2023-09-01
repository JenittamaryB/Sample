package Newpro;


public class Method { 
	   int length; 
	   int breadth; 

	   void perValue(int l, int b)
	   {  
	      length = l; 
	      breadth = b; 
	   } 
	  void calculate()
	  { 
	    int perimeter = 2*(length + breadth); 
	    System.out.println("Perimeter of the Rectangle:" +perimeter); 
	  } 
	 public static void main(String[] args)
	 { 
	    Method obj = new Method(); 
	    obj.perValue(20,30); 
	   obj.calculate();  
	    
	   } 
	 }

