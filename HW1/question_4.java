import java.io.*;
import java.util.*;
//Trevaughn McGregor
//09/04/17

class Redirect
{
	public static void main(String[] args)
	{
	 Scanner input = new Scanner(System.in);
	 System.out.println("Numbers: ");
	
	  while(input.hasNextInt())
	  {
	   System.out.println(input.nextInt());
	  }
       
	   input.close();



    }
/*
cited:https://chortle.ccsu.edu/java5/Notes/chap22/ch22_2.html
*/
}