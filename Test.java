public class Test
{
	private static String[] Thread1 = {"A", "E", "I", "M","Q", "U", "Y"};
	private static String[] Thread2 = {"B", "F", "J", "N", "R", "V", "Z"};
	private static String[] Thread3 = {"C", "G", "K", "O", "S", "W"};
	private static String[] Thread4 = {"D", "H", "L", "P", "T", "X"};
	
	
	public static void main(String[] args)
	{
	  Threads T1 = new Threads(Thread1);
	  T1.start();
	 
	  Threads T2  = new Threads(Thread2);
	  T2.start();
	  
	  Threads T3 = new Threads(Thread3);
	  T3.start();
	  
	  Threads T4  = new Threads(Thread4);
	  T4.start();
		
	}
	/*Source: https://www.tutorialspoint.com/java/java_multithreading.htm
	 https://beginnersbook.com/2013/03/multithreading-in-java/
	  */
	
}