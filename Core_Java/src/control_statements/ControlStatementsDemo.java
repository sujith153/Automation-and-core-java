package control_statements;

public class ControlStatementsDemo {
	public static void main(String[] args) {
		// if else statement
		// do while loop
		// while loop
		// for loop
		// for each loop
		// switch statement
		// break statement
		// continue statement

		int x = 2;
//				y = 50;

//		if(x >= y) 
//			System.out.println(x+" is bigger number than "+ y);
//		else 
//			System.out.println(y+" is bigger number than "+ x);
//		for(int i = 1; i <= x; i++) {
//			System.out.println(i);
//		}

//		int i = 1;
//		for(; i <= x; ) {
//			System.out.println(i);
//			i++;
//		}

//		int i = 1;
//		while(i <= x) {
//			System.out.println(i);
//			i++;
//		}

//		int i = 1;
//		do {
//			System.out.println(i);
//			i++;
//		}while(i >= x);

		switch (x) {
		case 1: System.out.println("Jan");
			
			break;
		case 2: System.out.println("Feb");
		
		break;
		case 3: System.out.println("Mar");
		
		break;

		default: System.out.println("Check the month ");
			break;
		}
//		int k =4;
//		for (int i = 4; i >= 1; i--) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//			
//		}
//		int n =4;
//		for (int i = 1; i <= n ; i++) {
//			for(int s = 1 ; s<= (n-i) ; s++) {
//				System.out.print(" ");
//			}
//			for(int j = 1 ; j <= i*2-1; j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
		int f = 5;
		for (int i = 1; i <= f; i++) {

			for (int j = f; j >= i; j--) {
				System.out.print("  ");

			}
			for (int k = 1; k <= i*2-1; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
//		for (int i = 1; i <=n; i++) {
//			
//			for (int j = 1; j <=i ; j++) {
//				System.out.print("* ");
//			}
//			
//			System.out.println();
//			
//		}

	}
}
