package collections;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		s.push(null);
		s.push(324);
		s.push(234);
		s.push(5);
		s.push(4);
		s.push(352);
		s.push(35);
		s.push(46);
		s.pop();
		System.out.println(s.search(324));
		System.out.println(s.indexOf(324));
		System.out.println(s.peek());
		
		
	}

}
