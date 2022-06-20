package june20;

import java.util.HashSet;
import java.util.Set;

//the solultion below passes all tests on hackerrank for the same problem (Sherlock and Squares

public class June20P1 {
	public static int squares(int a, int b) {
	   
	   
		
	 
	    double lower = Math.sqrt(a);

	    double upper = Math.sqrt(b);
	
	    Set<Integer> squares = new HashSet<>();
	    for (int x=(int)lower;x<=upper;x++){
	        squares.add(x*x);
	    }
	
	    int total = squares.size();
	    
	    if (lower!=(int)lower){
	        total--;
	    }
	    return total;
	    
	    
	    
	
	    

	    }


}
