package collections;

import java.util.*;

public class QueueDemo {

	public static void main(String[] args) {
		PriorityQueue<Integer> qu = new PriorityQueue<>();
		/*
		 * Queue ---> Priority Queue Deque---> ArrayDeque , LinkedList
		 * 
		 */

		qu.add(23);
		qu.offer(25);
		qu.add(6);
		qu.add(36);
		qu.add(345);
		qu.add(3);
		qu.add(3425);
		qu.add(334);
		qu.add(31);
		qu.add(13);
		qu.add(213);
		System.out.println(qu);
		qu.peek();// it will just show the 1st value
		System.out.println(qu.peek());
		System.out.println(qu);
//		qu.poll();// It will remove the 1st element but if u put it in syso statement
		System.out.println(qu.poll()); // it will give u the 1st element and removes it. FIFO
		System.out.println(qu);
		qu.remove();// It will remove 1 element from the 1st
		System.out.println(qu.remove(25));
		System.out.println(qu);

	}

}
