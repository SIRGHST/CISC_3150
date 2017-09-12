import java.util.*;


class Palin
{
  public static void main(String[] args)
  {
    System.out.println("Enter a string");
	
	List<String> listA = new ArrayList<String>();
	Scanner input = new Scanner(System.in);
	listA.add(input.nextLine());

    if(palinOrNot(listA))
	{
	System.out.println("Palindrome");
	}
  
  }

   public static boolean palinOrNot( List<String> listA)
   {
     List<String> listC = new ArrayList<String>();
     listC = listA;  // copy A into C
   
     int front = 0; 
     int back = listC.size() - 1;
     while(listC.size() > 1)
     {
	   if(listC.get(front) != listC.get(back))
	   {
		 System.out.println("Not a palindrome");
		 return false;
	   }
	    //delete objects
	    listC.remove(front);
	    listC.remove(back);
     }
    //System.out.println("Palindrome");
	return true; //if true,then palindrome
    
   }
  
  
/*
cite:https://docs.oracle.com/javase/7/docs/api/java/util/List.html
https://www.youtube.com/watch?v=K1LPR_aUono
Data Structures with C++,William Ford
*/
  
  
  }


