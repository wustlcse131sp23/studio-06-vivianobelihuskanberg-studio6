package studio6;

public class FactorialRecursionExampleTA {
	
	// Recursive method to calculate factorial
    public static int factorial(int n) {
        if (n == 1) {  // Base case: stop when n is 1
            return 1;
        } else {
            return n * factorial(n - 1);  // Recursive case: multiply n by factorial of (n - 1)
        }
    }

	public static void main(String[] args) {
		System.out.print(factorial(5));
	}

}

