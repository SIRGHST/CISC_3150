
public class Plugins
{
	public static void main(String[] args)
	{
		String plugDir = "C:\Users\Capta\Dropbox\My Website";
	    File dir = new File(plugDir);
		Scanner in = new Scanner(System.in);
		String pluginName = in.next();
	    
		File[] file = dir.listFiles();
		for(int i - 0; i < file.length; I++)
		{
		  try
		  {
			if(!file[i].endsWith(".class"))
				continue;
			System.out.println(file.getName());
		  
		  }catch(Exception e){
			  System.out.println("Error");
		  }
		   
			
		}
		
	  
	}
}




public class Plugin_A
{
	public void whoSaysHello()
	{
		System.out.println("Plug_A : Hello ");
			
	}
	 public void whoSaysBye()
	 {
		 System.out.println("Plug_A : Bye ");
		 
	 }
	
}

public class Plugin_B
{
	public void whoSaysHello()
	{
		System.out.println("Plug_B : Hello ");
			
	}
	 public void whoSaysBye()
	 {
		 System.out.println("Plug_B : Bye ");
		 
	 }
	
}

//Source:https://javaranch.com/journal/200607/Plugins.html
