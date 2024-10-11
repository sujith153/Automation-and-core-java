package firstprogram;

public class Practice {
	
	public static void prin() {
		System.out.println("in default");
	}
	
	public static void main(String[] args) {
		Practice p = new Practice();
		p.para(21,21,123);
		System.out.println(p.str("jcdajl"));
	}
	
	
	public int para(int x, int y) {
		x= 130;
		return x/y;
	}
	
	public int para(int a , int b, int c) {
		return a+b;
	}
	
	public String str(String ad) {
		ad = "it is a stirn";
		return ad;
	}

}
