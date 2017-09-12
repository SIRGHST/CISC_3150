import java.util.*;

class Pyramid
{
  public static void main(String[] args)
  {
	
	Scanner input = new Scanner(System.in);
	System.out.println("Enter size of pyramid ");
	int pSize = input.nextInt();
	
	 
    Py(pSize);
	 

 }

 
 //Recursively displays pyramid that counts up on the 
//left, and counts down on the right
 public static void Py(int pSize)
   {
	 if( pSize == 0)  //base case
	    return ;
	 
	 Py(pSize - 1);
	 
	 for (int i = 1; i <= pSize; i++) 
	 {
	  System.out.printf("%-6d", i);
	  System.out.print(" ");
	 }
	 
	 for(int k = pSize - 1; k > 0; k--)
     {
	  System.out.printf("%-6d", k);
      System.out.print(" ");
     }
	 
	 System.out.println();
	  
	}
 
}
/*
cite:https://alvinalexander.com/programming/printf-format-cheat-sheet
https://www.youtube.com/watch?v=YseitO6gTwE

*/
  
  
  
  
  
  







