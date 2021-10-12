import java.util.*;  
   
class LinearSearch  
{  
  public static void main(String args[])  
  {  
    int c, n, search, array[];  
   
    Scanner sc = new Scanner(System.in);  
    System.out.println("Enter number of elements");  
    n = sc.nextInt();   
    array = new int[n];  
   
    System.out.println("Enter array elements");  
   
    for (c = 0; c < n; c++)  
      array[c] = sc.nextInt();  
   
    System.out.println("Enter value to find");  
    search = sc.nextInt();  
   
    for (c = 0; c < n; c++)  
    {  
      if (array[c] == search)     
      {  
         System.out.println( " Element " +search +" found at position " + (c + 1));  
          break;  
      }  
   }  
   if (c == n)
      System.out.println("Element " +search + " not found");  
  }  
}  
