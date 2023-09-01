package Newpro;

public class Constructor{  
    int id;  
    String name;  
    Constructor(int i,String n)
    {  
    id = i;  
    name = n;  
    }   
    void display()
    {
    	System.out.println(id+" "+name);
    }  
   
    public static void main(String args[]){   
    	Constructor obj1 = new Constructor(1,"jeni");  
    	Constructor obj2 = new Constructor(2,"mary");  
    obj1.display();  
    obj2.display();  
   }  
}  


