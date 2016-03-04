import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
	while(true) {
	    Scanner s = new Scanner(System.in);
	    int n = getN(s);

	    if(n<0) continue;
	    
	    long out = factorial(n);
	    System.out.println(Long.toString(out));
		}
    }

    public static int getN(Scanner s) {
	int n = -1; // invalid number is our error flag
	try {
	    n = s.nextInt();
	} catch(Exception InputMismatchException) {
	    // and do nothing
	}

	return n;
    }

    public static long factorial(int x) {
	if(x==0) {
	    return 1;
	} else {
	    return x*factorial(x-1);
	}
    }
}
