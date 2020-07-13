import java.util.LinkedList;
import java.util.Queue;
import java.util.*;

/* CSSSKL 162
 * 
 * UsingStacksSuitorsLab
 * 
 * This class is mostly a driver for playing with Strings as palindromes, 
 * both iteratively and recursively.  The UsingStacksSuitorsLab class itself is
 * a runnable object, so it can be passed to a thread in our Queue demo
 * 
 * 
 */

public class UsingStacksSuitorsLab implements Runnable {
	private static int threadCount = 0;
	private String name;
	
	public UsingStacksSuitorsLab() {
		name = "#" + threadCount++ + "Thread";
	}
	
	public static void main(String[] args) {
		String s1 = "food";		    //not a palindrome
		String s2 = "racecar";      //a palindrome
			
		System.out.println("String1 is \"" + s1 + "\"");
		System.out.println("String2 is \"" + s2 + "\"");

		System.out.println(s1 + " reversed is: " );
		printReverse(s1);
		System.out.println(s2 + " reversed is: " );
		printReverse(s2);
		System.out.println();
		System.out.println(s1 + " recursively reversed is");
		recPrintReverse(s1);
		System.out.println();
		System.out.println(s2 + " recursively reversed is");
		recPrintReverse(s2);
		System.out.println();
		
		System.out.println(s1 + " is a palindrome: " + isPalindrome(s1));
		System.out.println(s2 + " is a palindrome: " + isPalindrome(s2));
		
		System.out.println(s1 + " is a palindrome(recursively): " + isPalindromeRec(s1));
		System.out.println(s2 + " is a palindrome(recursively): " + isPalindromeRec(s2));	
		
		System.out.println("Did we build a Queue of Threads and start them? " + buildThreadQueue());
		
		int n = 6;
		System.out.println("For " + n + " suitors, stand in place:" + findPlaceToStand(n, false));
		
		n = 10;
		System.out.println("For " + n + " suitors, stand in place:" + findPlaceToStand(n, false));

		int d = 6;
		System.out.println("For " + d + " suitors, stand in place:" + findPlaceToStand(d));
		d = 10;
		System.out.println("For " + d + " suitors, stand in place:" + findPlaceToStand(d));
	}
		
	
	
	
	public static void printReverse(String target) {
		//todo: use a stack
		LLStack stack = new LLStack();

		for(int i = 0; i < target.length(); i++) {
			stack.addToStart(target.charAt(i));
		}
		for(int i = 0; i < target.length(); i++) {
			System.out.print(stack.deleteHead());
		}
		System.out.println();
	}
	
	public static void recPrintReverse(String target) {
		//todo
		if (target.length() == 1) {
			System.out.print(target.charAt(0));
			return;
		}
		recPrintReverse(target.substring(1));
		System.out.print(target.charAt(0));


	}
	
	public static boolean isPalindrome(String input) {
		//todo: use a stack
		LLStack stack = new LLStack();
		String palindrome = "";

		for(int i = 0; i < input.length(); i++) {
			stack.addToStart(input.charAt(i));
		}
		for(int i = 0; i < input.length(); i++) {
			palindrome += stack.deleteHead();
		}
		return input.equals(palindrome);
	}

	public static boolean isPalindromeRec(String sentence)	{
	  	//todo
		// if length of sentence is 1 or 0, then backwards it's the same, and if the first character
		// in the sentence is not equal to the 2nd to last letter, then return false.
		// otherwise recursively call it by substringing the first character and the 2nd to last character
		if (sentence.length() == 1 || sentence.length() == 0) {
			return true;
		}
		return isPalindromeRec(sentence.substring(1, sentence.length() - 1));
	}

	public static int findPlaceToStand(int numSuitors) {
		//todo
		Queue<Integer> myQueue = new LinkedList<Integer>(); // add suitors to the queue.
		for (int i = 0; i < numSuitors; i++) {
			myQueue.add(i);
		}

		// while the size is greater than 1, if the count is not 0 and
		for (int count = 0; myQueue.size() > 1; count++) {
			if (count != 0 && count % 2 == 0) {
				myQueue.poll();
			} else {
				myQueue.offer(myQueue.poll());
			}
		}
		return myQueue.poll();
	}	

	public static int findPlaceToStand(int numSuitors, boolean temp) {
		Stack<Integer> suitors = new Stack<>();
		Stack<Integer> holder = new Stack<>();

		for (int i = 0; i < numSuitors; i++) {
			suitors.push(i);
		}

		for (int count = 0; suitors.size() + holder.size() > 1; count++) {
			if (count != 0 && count % 2 == 0) {
				suitors.pop();
			} else {
				holder.push(suitors.pop());
			}
			if (suitors.size() == 0) {
				for (int i = 0; i < holder.size(); i++) {
					suitors.push(holder.pop());
				}
			}
		}
		return suitors.pop();
	}

	public static boolean buildThreadQueue() {	//returns true upon success
		Queue<Thread> q = new LinkedList<Thread>(); 
		
		//when our program starts up, it might create multiple threads to use
		q.offer( new Thread(new UsingStacksSuitorsLab()));
		q.offer( new Thread(new UsingStacksSuitorsLab()));
		q.offer( new Thread(new UsingStacksSuitorsLab()));
		
		System.out.println("Initial Thread order:");
		q.toString();  
		
		//We need to iterate over our pool of threads and call start() on each one
		//Make a loop that dequeues a thread, calls start on it, and //enqueues it again
		//to do:
		/***
		Thread current = q.poll();
		current.start();
		q.offer(current);

		 this does not work properly, even when following guidelines. Goes into an infinite loop.
		 ***/
		//current = get a thread
		//current.start();
		//put the thread back
		
		System.out.println("Thread order after start()ing:");
		q.toString();
		return true;  //on successful start
	}
	
	
	/*
	 * No need to edit anything below here, 
	 * unless you'd like to change the 
	 * behaviour of each thread in the thread pool above
	 */
	
	@Override
	public void run() {
		for(int i = 0; i < 1000; i++) {
			System.out.println(name + ": " + i + "th iteration");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				//do nothing here
			}
		}
	}
}
