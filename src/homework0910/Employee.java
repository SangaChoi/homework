package homework0910;

public class Employee extends Person{
	
	private String dept=null;

	public Employee() {
	}
	public Employee(String name, int age, String dept) {
		super(name, age);
		this.dept = dept;
	}
	
	public void print() {
		super.print();
		System.out.println("   ºÎ¼­ : "+dept);
	}

}
