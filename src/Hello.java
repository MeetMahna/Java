/* Basic classes 
 * getters and setters
 * constructors 
 * loops - pattern printing
 */

// Student Class
class Student{
	private String name;
	private int rollno;
	private String collName;
	
	// default constructor
	Student(){
		name="XYZ";
		rollno=0;
		collName="ABC";
	}
	
	// parameterized constructor1
	Student(String n, int rn){
		name=n;
		rollno=rn;
		collName="ABC";
	}
		
	// parameterized constructor2
	Student(String name, int rollno, String collName){
		// using this keyword (as we are passing the arguments with same variable name)
		
		this.name=name;
		this.rollno=rollno;
		this.collName=collName;
	}
	
	// 3 getters - to get the variables
	public String getName() {
		return this.name;
	}
	public int getRollno() {
		return this.rollno;
	}
	public String getCollName() {
		return this.collName;
	}
	
	// 3 setters - to set the value of variables
	public void setName(String n) {
		this.name = n;
	}
	public void setRollno(int rn) {
		this.rollno = rn;
	}
	public void setCollName(String cn) {
		this.collName = cn;
	}
}

public class Hello {
	
	// main class
	public static void main(String[] args) {
		
		// dollar box - pattern printing
		int i, j;
		for (i = 0; i < 6; i++)
		{
			for (j = 0; j < 6; j++) 
			{
				if (i == 0 || j == 0 || i == 5 || j == 5) 
				{
					System.out.print("$ ");
				} 
				else 
				{
					System.out.print("- ");
				}
			}
			System.out.println(" ");
		}
		
		
		// Student objects
		Student obj1 = new Student(); // default constructor
		Student obj2 = new Student("MM",23,"AMITY"); // parameterized constructor
		
		// setting values for obj1 using setters
//		obj1.setCollName("Coll1");
//		obj1.setName("Meet");
//		obj1.setRollno(101);
		
		// Printing using getters
		System.out.println(obj1.getRollno()+"---"+obj1.getCollName()+"---"+obj1.getName());
		System.out.println(obj2.getRollno()+"---"+obj2.getCollName()+"---"+obj2.getName());
	}
	
}
