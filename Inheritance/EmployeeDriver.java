import java.util.ArrayList;
/*
 * Driver
 * Lab 
 * 
 * A simple driver to exercise the Employee hierarchy 
 */

public class EmployeeDriver {
	
	
	public static void main(String[] args) {
		Accountant emp1 = new Accountant( "Rick", 123456789);
		//this next employee makes a bit more than Rick
		Accountant emp2 = new Accountant( "Tim", 55555555,10000);
		//and lets make an hourly worker
		HourlyWorker emp3 = new HourlyWorker( "Jim", 11111111);
		//then a salaried worker
		SalariedWorker emp4 = new SalariedWorker( "Jane", 222222222, 5000);
		HourlyWorker emp5 = new HourlyWorker( "Joe", 11111111,20);
		
		//todo: Build some PermanentHire and Consultant objects here

		PermanentHire a = new PermanentHire("Rondo", 111223123, 20000);
		PermanentHire b = new PermanentHire("Kobe", 442244145, 40000);
		PermanentHire c = new PermanentHire("Joe", 333344432, 2000);

		Consultant aa = new Consultant("Bill", 1122334455, 250);
		Consultant bb = new Consultant("Don", 223344556, 240);
		//and add them to the ArrayList below

		ColorWithAlpha test = new ColorWithAlpha(100, 100, 100, 400);
		ColorException test2 = new ColorException("test");
		
		//and build a set of workers, all of which are employees
		ArrayList<Employee> myEmployees = new ArrayList<Employee>();
		
		myEmployees.add(emp1);
		myEmployees.add(emp2);
		myEmployees.add(emp3);
		myEmployees.add(emp4);
		myEmployees.add(emp5);
		myEmployees.add(a);
		myEmployees.add(b);
		myEmployees.add(c);
		myEmployees.add(aa);
		myEmployees.add(bb);
		//myEmployees.add(test2);

		//myEmployees.add(test);

		/*
			I get the error that there's no suitable method found for add(ColorWithAlpha) because
			ColorWithAlpha cannot be converted to Employee. The reason for this is because ColorWithAlpha
			doesn't extend Employee. PermanentHire extends SalariedWorker, which extends Employee.

			Same with ColorException, if you wanted this to work then ColorException would have to
			extend Employee or a subclass of Employee.

		 */
		//todo: add a sixth and seventh employee to this list that you create
		
		
		//this code doesn't need to change, even if you add 10 new employee classes and 
		//add 102 new employees - this is an example of generic code that can be written 
		//when inheritance hierarchies are in use
		for( int i = 0; i < myEmployees.size(); i++) {
			Employee current = myEmployees.get(i);
			System.out.println( current.getName() + " makes " + current.calculateWeeklyPay() + " per week.");
		}
		
		
	}
}
