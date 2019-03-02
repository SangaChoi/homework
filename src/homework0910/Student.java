package homework0910;

public class Student extends Person {
	
	private int id=0;

	public Student(){
	}
	public Student(String name, int age, int id) {
		super(name, age);
		this.id=id;
	}
	
	public void print() {
		//System.out.println("이름 : "+getName()+"   나이 : "+getAge()+"   학번 : "+id);
		super.print();
		System.out.println("   학번 : "+id);
	}
}
