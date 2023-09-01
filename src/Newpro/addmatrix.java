package Newpro;

public class addmatrix {
	  
		public static void main(String args[]){  
	
		int a[][]={{21,32,54},{42,94,73},{53,42,50}};    
		int b[][]={{11,23,54},{72,24,13},{17,21,42}};    
		int c[][]=new int[3][3];  
		    for(int i=0;i<3;i++)
            {    
		       for(int j=0;j<3;j++)
		       {    
                   c[i][j]=a[i][j]+b[i][j];    
		           System.out.print(c[i][j]+" ");    
		        }    
		        System.out.println();  
	         }    
		}
}  


