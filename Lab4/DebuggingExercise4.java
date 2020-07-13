import java.util.*;

/*
 * 1.) The watch screen for variables appears on the right, and it displays different variable
 * 	   values as well as object variable values
 * 
 * 2.) The call stack appears on the left which also displays which methods are being called
 *
 * 3.) Step over runs the next line of code
 *
 * 4.) Step into is the same as step over, but if the next line has a method call, then it displays
 * 	   steps of that method that's called
 *
 * 5.) Step out exits out of the body of the method
 *
 * 6.) What continue does is executing the next lines of code until it reaches a stop point
 */
public class DebuggingExercise4 {
	  public static void main(String[] args)
	    {
		  Scanner input = new Scanner(System.in);
		  System.out.println("Enter a name for the account");
		  String name = input.next();
		  
	        Account a = new Account(name);
	        a.deposit(100);
	        System.out.println(a.getOwner() + " has $" + a.getBalance());
	        a.withdraw(200);
	        System.out.println("After trying to withdraw $200, " + a.getOwner() + " has $" + a.getBalance());
	    }
}
