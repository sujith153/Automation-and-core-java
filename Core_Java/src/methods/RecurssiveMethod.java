package methods;

public class RecurssiveMethod {

	public static void main(String[] args) {
		print(1);
		System.out.println(fact(5));
		pact(5);

		int n = 3; // Calculate the 10th Fibonacci number
		System.out.println("The " + n + "th Fibonacci number is: " + fibonacci(n));

	}

	public static void print(int x) {
		if (x <= 10) {
			System.out.println(x);
			print(x + 1);
		}
	}

	public static int fact(int y) {
		int num = 1;
		if (y >= 1) {
			num = y * fact(y - 1);
		}
		return num;
	}

	public static void pact(int y) {
		int num = 1;
		if (y >= 1) {
			num = y * fact(y - 1);
		}
		System.out.println(num);
	}

	public static int fibonacci(int n) {
		if (n <= 1) {
			return n;
		}
		return fibonacci(n - 1) + fibonacci(n - 2);
	}

}
