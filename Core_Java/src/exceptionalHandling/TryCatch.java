package exceptionalHandling;

public class TryCatch {
	int x = 23;
	int y = 3;
	int result = 0;

	public void method() {
		try {
			int result = x / y;
			System.out.println(result);
		} catch (Exception ce) {
			System.out.println(ce.getMessage());
		} finally {
			System.out.println("I will execute whatever");
		}
//		try {
//			int num = 19 / 0;
//			System.out.println(num);
//		} catch (ArithmeticException e) {
//			System.out.println("we cannot divide a number by zero");
//		} finally {
//			System.out.println("Bye bye");
//		}

	}

	public static void main(String[] args) {

		TryCatch t = new TryCatch();
		t.method();

	}

}
