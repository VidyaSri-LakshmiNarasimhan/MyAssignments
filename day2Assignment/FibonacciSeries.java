package day2Assignment;

class FibonacciSeries{  
public static void main(String args[])  
{    
 int n1 = 0, n2 = 1, n3 , i , count=10;    
 System.out.print(n1+" "+n2); //printing 0 and 1    
 // Starting the loop with 2 as 0 and 1 already exists.
 for(i = 2;i < count; ++i)    
 {    
  n3 = n1 + n2;    
  System.out.print(" "+n3);    
  n1 = n2;    
  n2 = n3;    
 }    
}
}  
