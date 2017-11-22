import java.util.*;
import java.io.*;

class Tree
{
	public static void main(String[] args)throws IOException
	{
	 System.out.println("Enter path:");
	 Scanner in = new Scanner(System.in);
	 String path = in.nextLine();
	 
	 File file = new File(path);
	 
	 dirTree(file);
	
	
    }
 
 //prints all directories
  public static void dirTree(File dir)throws IOException
  {
	 //output
	 File output_file = new File("dir_tree.txt");
	 PrintWriter print_file = new PrintWriter(output_file);
	 
	 File[] tree = dir.listFiles();
	 if(dir.exists())
	 {
	  for(int i = 0; i < tree.length; i++)
	  {
		if(tree[i].isDirectory())
		{
		  print_file.println("|\t\t");
		  print_file.println(tree[i].getName());
		}
		 print_file.println("+----" + tree[i].getName().toString());
	  }
	   print_file.close();
	 }
	  
	 	
   }
	  
   /*sources:https://www.tutorialspoint.com/java/java_file_class.htm
   https://docs.oracle.com/javase/tutorial/essential/io/walk.html
   https://www.youtube.com/watch?v=3RNYUKxAgmw
    */
}