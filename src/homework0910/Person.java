package homework0910;

abstract public class Person {

///////////////Field	
	private String name=null;
	private int age=0;
	
///////////Constructor
	public Person() {
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
////////////Get	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
//////////////Set	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}

///////////Method
//	public abstract void print();
	
	public void print() {
		System.out.print("이름 : "+name+"   나이 : "+age);
	}
	
}
