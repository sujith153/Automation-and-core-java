package operators;

public class OperatorsDemo {
	public static void main(String[] args) {
		int x = 10, y = 5 , m = 7 , n = 8;
		System.out.println("x: "+x);
		//Arithmetic Operators (+, -, *, /, %)
		System.out.println((x+y)+" "+(x-y));
		
		//Unary Operators (-, ++, --)
//		int z = -x;
		//post increment( action first increment later)
		//in the below statement action is assigning x value to the a variable and a value is 10
		//after assigning x value will be incremented by 1 that is 11
		int a = x++;//x + 1;
		
		System.out.println(a);
		System.out.println(x);
		//pre increment( increment first action later)
		//in the below statement first y value will be incremented by 1 that is 6 
		//after increment x value will be assigned to b and finally b contains 6
//		int b = ++y;
		System.out.println(a);
		System.out.println(x);
		
		//post decrement ( action first decrement later)
	    int c = m--;
	    System.out.println(c);
	    System.out.println(m);
	    
	    // pre decrement decrement first action later)
	    int d = --n;
	    System.out.println(d);
	    System.out.println(n);
	    
	    //Assignment Operator (=)
	    
	    //Relational Operator (>, >=, <, <=, ==, !=)
	    System.out.println(x > y);//true
	    int aa = 10, bb = 10;
	    System.out.println(aa >= bb);//true
	    System.out.println(aa < bb);//false
	    System.out.println(aa <= bb);//true
	    System.out.println(aa == bb);//true
	    System.out.println(aa != bb);//false
	    
	    //  Logical Operators (&&, ||, !)
	    int cc = 20 , dd = 40;
	    System.out.println(cc<dd && cc<100);//true
	    System.out.println(cc<dd && cc <10);//false
	    System.out.println(cc>dd || cc<dd);//true
	    System.out.println(!(cc<dd));//false
	    //Boolean operators (&, |, !)
	    int f = 50 , g = 60;
	    //50 = 1 1 0 0 1 0
	    //30 = 1 1 1 1 0 0 
	    //&  = 1 1 0 0 0 0 == 48
	    //|  = 1 1 1 1 1 0 == 62
	    System.out.println(f&g);
	    System.out.println(f|g);
	    
	}
}
