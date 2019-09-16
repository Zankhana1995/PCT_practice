package string;

public class AllpossibleCombinationOfCharacters {
	public static void main(String[] args) {
		char[] set = { 'a', 'b' };
		int k = 3;
		String line = "";
		int n = set.length;
		printAllCombination(set, k,line,n);
	}

	private static void printAllCombination(char[] set, int k, String line, int n) {
		 // Base case: k is 0, 
	    // print prefix 
	    if (k == 0)  
	    { 
	        System.out.println(line); 
	        return; 
	    } 
	    for(int i=0;i<n;i++)
	    {
	    	// Next character of input added 
	        String newLine = line + set[i];  
	          
	        // k is decreased, because  
	        // we have added a new character 
	        printAllCombination(set, k-1,newLine, n);  
	    }
	}
}
