package RelationshipBtwObjects;

public class ObjectDemo {
	public static void main(String[] args) {
		Two t = new Two(15);
		One o = new One(t);
		o.display();
	}

}

class Two {
	int y;
	
	public Two(int y) {
		this.y = y;
	}
	
	public void display() {
		System.out.println("Y: "+y);
	}
	
}

class One {
	int x;
	
	Two t;
	
	public One(Two t) {
		this.t = t;
		this.x = 10;
	}
	
	public void display() {
		System.out.println("x: "+x);
		this.t.display();
	}
}