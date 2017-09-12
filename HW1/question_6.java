import java.util.*;
class Circle
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
	double[][] cirArray = new double[2][3];
	
	 for(int i = 0; i < cirArray.length; i++) //row
	  {
	   for(int j = 0; j < cirArray[0].length; j++) //col
	   {
	    System.out.println("Enter points(s) and radius: ");
		cirArray[i][j] = input.nextDouble();
	    
	   } 
	    
	  }
      System.out.println();
	  
	  for(int i = 0; i < cirArray.length; i++)
	  {
	   for(int j = 0; j < cirArray[0].length; j++)
	   {
	    System.out.println(cirArray[i][j] + " ");
	   } 
	    System.out.println();
	  }
	  
	  //Touch Formula
	  double dist = Math.sqrt( Math.pow(cirArray[1][0] - cirArray[0][0], 2) + Math.pow(cirArray[1][1] - cirArray[0][1], 2)   ); // distance from Circle A to B
	  double rad = Math.sqrt(cirArray[0][2] +  cirArray[1][2]); // sqrt of rad 1 + sqrt of rad 2
	  
	  if(dist == rad)
	  {
	    System.out.println("The circles touch");
	  }
	  if(dist == 1 && rad == 1)
	  {
	   System.out.println("The circles are within each other");
	  }
	  if(dist > rad )
	  {
	   System.out.println("The circles intersect");
	  
	  }else
	  {
	   System.out.println("The circles are disjointed");
	  }
     
	  
	 
	    
  
  
  
  
  }






}