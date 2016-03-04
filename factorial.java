import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
	System.out.println("N   Factorial\n--+--------------");
	for(int i=1;i<=20;i++) {
	    long out = factorial(i);
	    System.out.printf("%-4d%d\n", i, out);
	}
    }
    
    public static long factorial(int x) {
	if(x==0) {
	    // 0! is defined as 1, details at
	    // https://en.wikipedia.org/wiki/Factorial
	    return 1;
	} else {
	    // 5! = 5 * 4! and 4! = 4 * 3!, so we can do this
	    return x*factorial(x-1);
	}
    }
}
