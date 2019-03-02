abstract class Shape{
	
//////////////Field
	protected double area=0;
	private String name;
//////////////Constructor
	public Shape(){
	}
	public Shape(String name){
		this.name=name;
	}
////////////Method
	abstract void calculationArea();

	public void print(){
		System.out.println(this.name+"의 면적은 "+this.area);
	}
/////////////////Set
	public void setName(String name){
		this.name=name;
	}
	public void setArea(double area){
		this.area=area;
	}
///////////////Get
	public String getName(){
		return name;
	}
	public double getArea(){
		return area;
	}
}