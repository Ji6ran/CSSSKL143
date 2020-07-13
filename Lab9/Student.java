import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.text.DecimalFormat;


public class Student implements Serializable, Cloneable {
	private double GPA;
	private String name;
	
	public Student(String n, double gpa) {
		name = n;
		GPA = gpa;
	}

	public Student(Student other) {
		this.name = other.name;
		this.GPA = other.GPA;
	}

	@Override
	public Student clone() {
		return new Student(this);
	}

	public double compareTo(Student a) {
		DecimalFormat rounded = new DecimalFormat("###.00");

		if (this.GPA > GPA) {
			double newNum = Math.abs(Double.valueOf(rounded.format(this.GPA - a.GPA)));
			//System.out.println(this + " has a higher GPA than " + a + " by: ");
			return newNum;

		}
		else {
			double newNum1 = Math.abs(Double.valueOf(rounded.format(a.GPA - this.GPA)));
			//System.out.println(a + " has a higher GPA than " + this + " by: ");
			return newNum1;
		}
	}

	@Override
	public String toString() {
		return this.name;
	}

	public double getGPA() {
		return this.GPA;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setGPA(double GPA) {
		this.GPA = GPA;
	}
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		writeObjectToFile();
		Student one = readObjectFromFile();
		
		if(one != null) {
			System.out.println(one.toString());
		}
		// output was Nguyen, and we just accomplished writing an object to a file, and then reading it


		Student a = new Student("A", 3.1);
		Student b = new Student("B", 3.3);
		Student c = new Student("C", 3.9);
		Student d = new Student("D", 3.34);
		Student e = new Student("E", 3.35);
		Student f = new Student("F", 3.01);
		Student g = new Student("G", 3.98);
		Student h = new Student("H", 2.41);
		Student i = new Student("I", 4.0);
		Student j = new Student("J", 3.7);

		System.out.println("Difference between a and b is " + a.compareTo(b));
		System.out.println("Difference between b and c is " + b.compareTo(c));
		System.out.println("Difference between c and d is " + c.compareTo(d));
		System.out.println("Difference between d and e is " + d.compareTo(e));
		System.out.println("Difference between e and f is " + e.compareTo(f));
		System.out.println("Difference between f and g is " + f.compareTo(g));
		System.out.println("Difference between g and h is " + g.compareTo(h));
		System.out.println("Difference between h and i is " + h.compareTo(i));
		System.out.println("Difference between i and j is " + i.compareTo(j));
		System.out.println("Difference between j and a is " + j.compareTo(a));

		Student clonedA = (Student) a.clone();
		System.out.println(clonedA);
		System.out.println();
	}

	private static Student readObjectFromFile() throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream is = new ObjectInputStream(new FileInputStream("data.obj"));
		Student one = (Student) is.readObject();
	
		is.close();
		
		return one;
	}

	private static void writeObjectToFile() throws FileNotFoundException, IOException {
		Student nguyen = new Student("Nguyen", 3.5);

		ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("data.obj"));
		os.writeObject(nguyen);
			
		os.close();		
	}

}
