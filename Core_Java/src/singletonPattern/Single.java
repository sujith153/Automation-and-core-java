package singletonPattern;

public class Single {
	private static Single single = null;
	// String str = null;

	private Single() {
	}

	public static Single getInstance() {
		if (single == null) {
			synchronized (Single.class) {
				if (single == null) {
					single = new Single();
				}
			}
		}
		return single;
	}

	public void display() {
		System.out.println("From Single class method");
	}
}
