package control_statements;

public class ContinueStatement {

	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			if(i%2==0) {
//				System.out.print(i+ " ");
			}else {
				System.out.print(i+" ");
			}
		}
		printNumbers();
		
		
	}
	
	public static int printNumbers() {
		for (int i = 1; i < 10; i++) {
			System.out.println(i);
			if(i==5) return i;
		}
		return 0;
	}

}
