class Employee{
	String name; // stored in heap memory and is different for each object
	int empno; // same as above
	static String company; // stored in class loader memory and is same for all objects, i.e, only one copy is maintained
	
	
	// static block- used for initialization for static variables, will be executed when we load a class
	static {
		company = "Google";
	}
	
	// static variable- similar to static variable, it can be invoked without an object. 
	// It can only access static data members and change the value of it.
	static void changeCompany(String comp){
		company = comp;
		// name = "hello"; // cannot do this,  as name is not static
	}
	public void show() {
		System.out.println(name+ "-"+ empno+ "-"+ company);
	}
}



class OuterClass{
	int a=1; // non static member
	static int b;
	
	static {
		System.out.println("In Static Block");
		b=100;
	}
	
	public void display() {
		System.out.println("In Outer Display");		
		System.out.println("a="+ a+ ", b="+ b);
	}
	
	// nested class - class within another class
	// Member class or Class inner class --> non static nested class - its instance cannot be created without the instance of outer class
	class InnerClass{
		// as object of this class is created using outer class, 
		//it can access all members of outer class without a reference variable to the out class object.

		// Inner class can access both static and non static members of outer class
		public void show() {
			System.out.println("Inner Show");
			System.out.println("a="+ a+ ", b="+ b);
		}
		
	}
	
	// Static Nested Class --> can be instantiated without instantiating the outer class
	static class StaticNestedClass{
		// It can access only static members of the outer class
		public void show() {
			System.out.println("Static Nested Show");
			// cannot make a reference to non static member (a) --> Compile Time Error
			System.out.println("b="+ b);
			
		}
	}
	
	// Third type of nested class is Anonymous class --> Later
}


public class StaticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee();
		emp1.name = "Meet";
		emp1.empno = 101;
		Employee emp2 = new Employee();
		emp2.name = "Geet";
		emp2.empno = 102;
		
		emp1.show();
		emp2.show();
		
		Employee.company = "EPAM"; // We don't need object here and it will be changed for all objects
		
		emp1.show();
		emp2.show();
		
		Employee.changeCompany("Apple"); // calling static method
		emp1.show();
		emp2.show();
		
		// Nested Classes
		System.out.println("------------------------");
		
		OuterClass o1 = new OuterClass();
		o1.display();
		
		OuterClass.InnerClass in1 = o1.new InnerClass(); // outer class object (o1) needed
		in1.show();
		OuterClass.StaticNestedClass obj2 = new OuterClass.StaticNestedClass(); // outer class object (o1) not needed
		obj2.show();
		
	}

}
