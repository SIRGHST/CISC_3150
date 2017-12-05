
public class Threads implements Runnable 
{
	private Thread t;
	private String[] threadArr;
	
	Threads(String[] name)
	{
		System.arraycopy(name,0, threadArr,0, threadArr.length);
		
	}
	
	public void run()
	{
	  
	  try{
		  for(int i = 0; i < threadArr.length; i++)
		  {
			System.out.println(threadArr[i]);	
			Thread.sleep(100);
		  }
	  
	  }catch(InterruptedException e){
	   System.out.println("Interrupted: " + threadArr);
	  }
	  System.out.println("Exit: " + threadArr);
	}
	
    

	public void start()
	{
	  if(t == null)
	  { 
		  t = new Thread(this, threadArr);
		  t.start();
		  
	  }
	}	

		
		
}
	
	

	

