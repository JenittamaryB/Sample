package Newpro;

 class Banks
    {  
	float getRateOfInterest()
	   {
		return 0;
		
	   }  
	}  
	class SBI extends Banks
	{  
	float getRateOfInterest()
	   {
		return 8.4f;
		}  
	}  
	class ICICI extends Banks
	{  
	float getRateOfInterest()
	    {
		return 7.3f;
		}  
	}  
	class AXIS extends Banks
	{  
	float getRateOfInterest()
	   {
		return 9.7f;
		}  
	}  
	 public class poly
	 {  
	public static void main(String args[]) 
	 {  
	Banks b=new SBI();  
	System.out.println("SBI Rate of Interest: "+b.getRateOfInterest());  
	Banks b1=new ICICI();  
	System.out.println("ICICI Rate of Interest: "+b1.getRateOfInterest());  
	Banks b2=new AXIS();  
	System.out.println("AXIS Rate of Interest: "+b2.getRateOfInterest());  
	}  
	 }

