import java.util.*;

public class Calc
{
	public static void main(String[] args)
	{
		String op1;
		String op2;
		String operator = "";
		Scanner num_input = new Scanner(System.in);
		Scanner op_input =  new Scanner(System.in);
		
		System.out.println("Enter a #: ");
		op1.isANumber(num_input.next());
		if(op1 == " ")
			throw new UserIsADumbassException("forgot a number");
	
		
		System.out.println("Enter another #: ");
		op2.isANumber(num_input.next());
		if(op2 ==  " ")
			throw new UserIsADumbassException("forgot a number");
		
		
		System.out.println("Enter operator");
		operator = op_input.next();
		
	  try
	  {
		switch(operator)
		{
		 //add
		 case "+":
			  System.out.println("result: " + (op1 + op2));
			  break;
		 //subtract
		 case "-":
			  System.out.println("result: " + (op1 - op2));
			  break;	
		//multiply
		case "*":
			  System.out.println("result: " + (op1 * op2));
			  break;
		//divide
		 case "/":
			  System.out.println("result: " + (op1 / op2));
			  if(op2 == 0)
			   throw new ArithmeticException("dividing by zero is not allowed");
			  break;	
	    //modulo
		case "%":
			  System.out.println("result: " + (op1 % op2));
			  break;	
	   
		default:
			 System.out.println("");
		}
		
	  }
	
	  catch(UserIsADumbassException e){}
	  catch(IllegalOperationException e){}
	  catch(IllegalArgumentException e){}
	  
	}
    
	//test whether its a number
	boolean isANumber(String num)
	{
	  try
	  {
        Double.parseDouble(num);
	  }
	   catch(LookAtMrAlgebraOverHereException e)
	   {
		 return false;
	   }
		return true;
    }
	
	
	
	
	
}
//If the user enters anything other than a number where a number belongs
public class LookAtMrAlgebraOverHereException extends IllegalArgumentException
{
   private String message = "LookAtMrAlgebraOverHereException";
   
   public LookAtMrAlgebraOverHereException()
   {
	 System.print(message);
   }
	public LookAtMrAlgebraOverHereException(String str)
	{
	  System.print(message + " " + str);
	}

}
//If the user enters an operation which isn't supported
public class IllegalOperationException extends IllegalArgumentException
{
   private String message = "IllegalOperationException";
   
   public IllegalOperationException()
   {
	 System.print(message);
   }
	
	public IllegalOperationException(String str)
	{
	  System.print(message + " " + str);
	}
}
//If the user forgets to enter a number, throw a UserIsADumbassException
public class UserIsADumbassException extends IllegalArgumentException
{
   private String message = "UserIsDumbassException";
   
   public void UserIsDumbassException()
   {
	 System.print(message);
   }
	
	public UserIsADumbassException(String str)
	{
	  System.print(message + " " + str);
	}
}
/*source cited:https://www.youtube.com/watch?v=ZianeEr9Rck
	http://javaconceptoftheday.com/java-program-to-check-user-input-is-number-or-not/
	
	*/