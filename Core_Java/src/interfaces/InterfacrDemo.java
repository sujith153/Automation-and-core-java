package interfaces;

public class InterfacrDemo {
	public static void main(String[] args) {
		One one = new Three();
		one.mul();
		One.add(5, 8);
	}
}


class Three implements One, Two {

	@Override
	public void mul() {
		System.out.println("From class Three");		
	}

	@Override
	public void sub() {
		
	}

	@Override
	public void sub(int a, int b) {
		
	}
	
}