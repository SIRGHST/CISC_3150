import java.util.*;
class Radius
{
  public static void main(String[] args)
  {
   
   Scanner input = new Scanner(System.in);
   System.out.println("Enter radius");
   
   while(input.hasNextDouble())
   { 
	double radius = Math.PI * Math.pow(input.nextDouble(), 2);
    System.out.println("The radius is: " + radius);
    System.out.println("Enter radius ");  
   }
   input.close();

	
  }

}