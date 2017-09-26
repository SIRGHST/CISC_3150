import java.util.*;


class Queens
{
	public static void main(String[] args)
	{
		
		Scanner N = new Scanner(System.in);
		System.out.println("Enter size of board  equal to or greater than 4");
		N = N.nextInt();
		
		int[][] boardArr = new int[N][N];
		int numOfQueens = 0;
		
	    for(int i = 0; i < boardArr.length; i++)
		{
		  for(int j = 0; j < boardArr[0].length; j++)
		  {
			  //boardArr[i][j] = 0;
  
			if(boardArr[i][j] == 0)	
            {
              boardArr[i][j] = 1;
              numOfQueens++; //on board
            }
			else if(boardArr[i][j] == 1)
            {
               boardArr[i][j] = 0;
			   numOfQueens--;//off board
            }			 
		 }
		}
		 
        //print		 
	    for(int i = 0; i < boardArr.length; i++)
		{
		  for(int j = 0; j < boardArr[0].length; j++)
		  {
			System.out.print(boardArr[i][j] + " ");
          }	  
			System.out.println("");			
		}			
			
			
    }
		/*		
		while(!false)
		{
			
			if((N % 2 == 0) &&(N != 6k)
			{
			  //print
			
			}
			
			
		}
		 */

		
		
}
	
	/*
	https://en.wikipedia.org/wiki/Eight_queens_puzzle
	http://www.geeksforgeeks.org/backtracking-set-3-n-queen-problem/
	 */
	

	
	
	
