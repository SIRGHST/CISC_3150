import java.util.*;


class Delimit
{
	public static void main(String[] args)
	{
	  System.out.println("Enter words,separated by commas");
	  Scanner in = new Scanner(System.in);
	  in.useDelimiter(",");
	
	  while(in.hasNext())
	  {
	    String words = in.next();
	    System.out.println(words);
	  
	  }
	
	}





}