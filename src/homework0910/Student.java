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
		//System.out.println("�̸� : "+getName()+"   ���� : "+getAge()+"   �й� : "+id);
		super.print();
		System.out.println("   �й� : "+id);
	}
}
