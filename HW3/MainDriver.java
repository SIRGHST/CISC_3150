import java.util.*;
//Trevaughn McGregor

class MainDriver
{
	public static void main(String[] args)
	{
		char[] chars = {'T','h','E', 'c','O','w','j','o','V','e'};
		MyString obj = new MyString(chars);
		
		
		//index with charAt()
		System.out.println("the character @ the index is:  ");
		System.out.println(obj.charAt(5));
		
		
		//length with length()
		System.out.println("the length of the string is:  ");
		System.out.println(obj.length());
		
		
		//substring with substring
		System.out.println("the substring of the string is:  ");
		System.out.println(obj.substring(4,10));
		
		//lowercase
		System.out.println("lowercase:  ");
		System.out.println(obj.toLowerCase());
		
		//UPPERCASE
		System.out.println("uppercase:  ");
		System.out.println(obj.toUpperCase());
		
		//equals
		String str1 = new String ("ThE cOw juMp oVeR the sun");
		System.out.println("isItEqual:  ");
		System.out.println(obj.equals(str1)); //should return false;
		char[] c2 = {'T','h','E', 'c','O','w','j','o','V','e'};
		System.out.println("isItEqual:  ");
		System.out.println(obj.equals(c2)); //should return true;
		
		//getString
		 System.out.println(obj.getMyString());
	
	     //toString;
		 System.out.println(str1.toString());
		 
		 //valueOf
	     System.out.println(obj.valueOf(45));
	
	
	}




}