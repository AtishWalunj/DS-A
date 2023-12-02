package assignAddRECurssiveAndSorting;
import java.util.*;

public class FibonacciHashtable {
   private static Hashtable<Integer,Long> memo=new Hashtable<>();
  
    public static void main(String[] args) {
    	
    	
		Integer n=5;
		Long result = null;
		for (int i = 0; i < n; i++) {
			 result=Fibonacci(i);
			System.out.print(Fibonacci(i)+" ");
        }
		System.out.println("\nFibonacci"+n+" "+"="+result);
	}
    public static long Fibonacci(int n) {
		
    	if(n<0) {
    		throw new IllegalArgumentException("I/P must be non negative integer...");
    	}
    	
		if(memo.containsKey(n)) {
			return memo.get(n);
		}
		if(n==0) {
			return 0;
		}
		else if(n==1) {
			return 1;
		}
	   Long result = Fibonacci(n-1)+Fibonacci(n-2);
		memo.put(n, result);
		
    	return result;
    	
    }

}
