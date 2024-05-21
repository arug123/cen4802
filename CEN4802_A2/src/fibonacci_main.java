
public class fibonacci_main {
/**@author Anthony Ruggiero
 * @version 1.01
 * This app is used to return the number that corresponds the requested position of the fibonacci sequence.  The main app calls the fibonacci_app class and the fibonacci method 
 * and passing n as the input.
 * 
 * @param n the user request position of the fibonacci sequence you want to return
 * @return answer the number in the position of the fibonacci sequence requested by user 
 * @param args
 */
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
