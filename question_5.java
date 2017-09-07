import java.util.*;
//Trevaughn McGregor
class Triangle
{
	public static void main(String[] args)
	{
	  Scanner input = new Scanner(System.in);
	  double[][] triArray = new double[3][2];
	   
	  for(int i = 0; i < triArray.length; i++) //row
	  {
	   for(int j = 0; j < triArray[0].length; j++) //col
	   {
	    System.out.println("Enter point(s): ");
		triArray[i][j] = input.nextDouble();
	    
	   } 
	    System.out.println();
	  }
	  input.close();
	  
	  double len_1 = Math.sqrt( Math.pow(triArray[1][0] - triArray[0][0], 2) + Math.pow(triArray[1][1] - triArray[0][1], 2)   ); //distance  A / B
	  double len_2 = Math.sqrt( Math.pow(triArray[2][0] - triArray[1][0], 2) + Math.pow(triArray[2][1] - triArray[1][1], 2)   ); // distance B / C
	  double len_3 = Math.sqrt( Math.pow(triArray[2][0] - triArray[0][0], 2) + Math.pow(triArray[2][1] - triArray[0][1], 2)   ); // distance A / C
	  
	  System.out.println("LENGTH from A TO B: " + len_1);
	  System.out.println("LENGTH from B TO C: " + len_2);
	  System.out.println("LENGTH from A TO C : " + len_3);
	 
	  if( len_1 + len_2 > len_3 || len_2 + len_3 > len_1 || len_1 + len_3 > len_2) //test whether triangle is real or not
	  {
       System.out.println("real Triangle");
	  }else{
	   System.out.println("Not Real");
	  }
	  
	   
	   /*
	  for(int i = 0; i < triArray.length; i++)
	  {
	   for(int j = 0; j < triArray[0].length; j++)
	   {
	    System.out.println(triArray[i][j] + " ");
	   } 
	    System.out.println();
	  }
	 
	    */
	
	}


/*
cite:http://introcs.cs.princeton.edu/java/14array/
*/

}