
public class fibonacci_main {

	public static void main(String[] args) {
		// Anthony Ruggiero - CEN4802 - 05/21/2024
		
		int n = 10;
		int answer = 0;
		answer = fibonacci_app.fibonacci(n);
		
		System.out.println("the " + n + "th term of the Fibonacci sequence is " + answer);
		

	}

	public class fibonacci_app {
		
		public static int fibonacci(int n)  {
		    if(n == 0)
		        return 0;
		    else if(n == 1)
		      return 1;
		   else
		      return fibonacci(n - 1) + fibonacci(n - 2);
		}

	}
}
