package firstprogram;

public class SytemOutDemo {
	public static void main(String[] args) {
		One.out.println("test");
		System.out.print("123");
		System.out.println("987");
		System.out.printf("%d",2);
		System.err.println("in red colour");
		Practice.prin();
	}
}


class OTS {
	public int x = 10;
	public void println(String data) {
		System.out.println(data);
	}
}

class One {
	public static OTS out = new OTS();
}


