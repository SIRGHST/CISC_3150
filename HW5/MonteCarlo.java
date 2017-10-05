import java.util.*;

class MonteCarlo
{
  public static void main(String[] args)
  {
	double a = 0;
	double b = 0;
    int attempt = 0;
	int inCircle = 0;
	int y = 100000;
    long x =1000000000L;
	for(int i = 0; i < x; i++)
	{
		a = Math.random();
		b = Math.random();
		
        attempt++;
		
		if( Math.pow(a,2) + Math.pow(b,2) <= 1)
	    {
		  inCircle++; //success 
		
		}
	
	}
      System.out.println("Pi =  " + 4 * (double)inCircle/(double)attempt);
   
   
   /*source:
     http://www.mathcs.emory.edu/~cheung/Courses/170/Syllabus/07/compute-pi.html
	 https://www.youtube.com/watch?annotation_id=annotation_1478309889&feature=iv&src_vid=cKPVnIi9rpU&v=r6vw_hWtQkk
     */
  }












}