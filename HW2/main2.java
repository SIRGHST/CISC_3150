import java.util.*;

class Calendar
{
	public static void main(String[] args)
	{
	 System.out.println("Enter year:  "); //asks for year
	 Scanner in = new Scanner(System.in);
	 int year = in.nextInt();
	
	 System.out.println("What day was the 1st of January on? [1-Mon 2-Tues 3-Wed  4-Thurs 5-Fri 6-Sat 7-Sun]");
	 int day = in.nextInt();
	 int daysPerMonth = 0;
	 String Month;
	
   for(int month_ = 1; month_ <= 12; month_++) //displays every month;
   {
	switch(month_) {
	 case 1: 
	    Month = "January ";
         daysPerMonth = 31;
		 break;
          case 2: 
	    Month = "February ";  
        	if((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) //leap year condition
			{   
			    daysPerMonth = 29;
                break;
			}else{ 
			    daysPerMonth = 28;
			    break;
			 }
          case 3: 
	    Month = "March ";
		 daysPerMonth = 31;
            break;
          case 4: 
	    Month = "April ";
		  daysPerMonth = 30;
            break;
          case 5: 
	    Month = "May ";
		  daysPerMonth = 31;
            break;
          case 6: 
	    Month = "June ";
		  daysPerMonth = 30;
            break;
          case 7: 
	    Month = "July ";
		  daysPerMonth = 31;
            break;
          case 8: 
	    Month = "August ";
		  daysPerMonth = 31;
            break;
          case 9:
	    Month = "September ";
		  daysPerMonth = 30;
            break;
          case 10: 
	    Month = "October ";
          daysPerMonth = 31;
			break;
          case 11: 
	    Month = "November ";
          daysPerMonth = 30;
			break;
          case 12: 
	    Month = "December ";
          daysPerMonth = 31;
		   break;
          default:
	    Month = "Try Again";
     }
      System.out.println(Month + year);
      System.out.println( "Sun  Mon  Tue   Wed   Thurs   Fri  Sat");
	  
      for(int i = 0; i < day; i++) //populate calendar
	  {
	    System.out.print("  ");
	  }
	  for(int j = 1; j <= daysPerMonth; j++)
	  {
		 System.out.printf("%-6d", j);
		 if((j % 7 == 0) || (j == daysPerMonth)) 
		    System.out.println();
	  }
	    System.out.println();
	  
	
	}
   
   }
	/*cite:https://stackoverflow.com/questions/725098/leap-year-calculation 
	 
			
	*/
	
	
	
	








}