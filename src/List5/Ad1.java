package List5;


public class Ad1 {

	public static void main(String[] args) {

		int n1= 5;
		int n = n1+1;
	    int[][] tabliczka = new int[n][n];

	    tabliczka = Uzupelnij(n);
	    
	    String tabliczkaStr = tabToString(tabliczka);

	   /// System.out.print(tabliczkaStr);
	    
	    for (int i = 0; i < (tabliczka.length); i++) {
			
		      for (int j = 0; j < (tabliczka[i].length); j++)
		        {
		        	System.out.printf("%4d", tabliczka[i][j]);
		        }
		      
		        System.out.println();

		   }
	}

	
	public static String tabToString(int[][] tab)
	{
		String aString= "";
		int column;
	    int row;

	    for (row = 0; row < tab.length; row++) 
	    {
	        for (column = 0; column < tab[0].length; column++ ){
	        	
	        aString = aString + " " + tab[row][column];
	        }
	        
	        aString = aString + "\n";
	    }
	    
		return aString;
		
		
	    
	}
	
	public static int[][] Uzupelnij(int k)
	{
	    int [][] arr = new int[k][k];
	    
	    for (int i = 0; i < (arr.length) ; i++)
	    {
	    	
	    	for (int j = 0; j < (arr[i].length); j++)
	        {
	    		if(i == 0 && j == 0)
		    	{
		    		arr[i][j] = 0;
		    	}
	    		else if(i==0 && j != 0)
	    			arr[i][j]=j;
	    		
	    		else if(j==0 && i != 0)
	    			arr[i][j]=i;
	    		
	    		else
	            arr[i][j] = i*j;
	        }

	    }
	    return arr;
	}

	}