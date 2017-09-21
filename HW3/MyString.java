

public class MyString
{
	
	 public char[] chars;
	
	//Creates a MyString object that represents an [] character sequence 
	public MyString(char[] chars)
	{
	  this.chars = new char[chars.length];
	  
	  for(int i = 0; i < chars.length; i++)
	  {
		  this.chars[i] = chars[i];
	  }
		
	}
	
	//Returns character @ specified index
	public char charAt(int index)
	{
		return this.chars[index];
		
	} 
    
	//Returns # of character in string
    public int length()
	{
	   return this.chars.length;
	}


    //Returns MyString object containing the substring from the specified begin index to end index
    public MyString substring(int begin, int end)
	{
		char[] sub = new char[chars.length];
		
	    for(int i = begin; i < end; i++)
		{
		 	sub[i] = this.charAt(i);	
		}
		 return new MyString(sub);
	} 



    //Returns a MyString obj with all letters in lowercase
    public MyString toLowerCase()
	{
		char[] lower = new char[chars.length];
		for(int i = 0; i < this.length(); i++)
		{
		  lower [i] = this.chars[i];
		  if((this.chars[i] >= 97) && (this.chars[i] <= 122)) //lowercase ASCII #'s
		  {
			  lower[i] += 32; //converts uppercase to lowercase
		  }
			
		}
		 return  new MyString(lower)
		 ;
		
	}


    //Returns a MyString obj with all letters in uppercase.
	public MyString toUpperCase()
	{
		char[] upper=new char[chars.length] ;
		for(int i = 0; i < this.length(); i++)
		{
		  upper [i] = this.chars[i];
		  if((this.chars[i] >= 65) && (this.chars[i] <= 90)) // uppercase ASCII #'s
		  {
			  upper[i] -= 32; //converts lowercase to uppercase
		  }
			
		}
		 return  new MyString(upper);
		
	}
	
	
	//Returns true if two string are equal to each other;false otherwise
	public boolean equals(MyString s)
	{
		if(this.length() == s.length())
		  return true;
	 
			return false;
		
	}
	
	
	//Return MyString obj
	public MyString getMyString()
	{
		char[]chars;
		chars = this.chars;
		return new MyString(chars);
	}
	
	
	
	//Returns String obj representing the value of this Integer.
	public String toString()
	{
		String str = new String();
		
		for(int i = 0; i < this.length(); i++)
		{
			str += this.charAt(i);
			
		}
		 return str;
	}
	
	//Convert int to MyString obj and return
	public static MyString valueOf(int i)
	{
		//MyString str = new MyString();
		//str = 
		
		return new MyString(Integer.toString(i).toCharArray());
		
		
	}
	
	
	
}

/*
  http://www.dreamincode.net/forums/topic/154367-convert-text-to-ascii-upper-to-lower-lower-to-upper/
  http://www.asciitable.com/
  http://fisnikhasani.com/make-your-own-custom-c-touppercase-and-tolowercase-functions-intermediate-level/
  https://docs.oracle.com/javase/7/docs/api/java/lang/Integer.html
  
*/