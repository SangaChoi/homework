package homework0910;

public class Teacher extends Person{
	
	private String subject=null;

	public Teacher() {
	}
	public Teacher(String name, int age, String subject) {
		super(name, age);
		this.subject=subject;
	}
	
	public void print() {
		super.print();
		System.out.println("   담당과목 : "+subject);
	}

}
