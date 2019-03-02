public class Circle extends Shape{

////////////Field
	private double radius=0;

///////////Constructor
	public Circle(){
	}
	public Circle(String name, int radius){
		super(name);
		this.radius=radius;
	}

/////////////Method
	public void calculationArea(){
		super.area=radius*radius*Math.PI;
	}

///////////////Set
	public void setRadius(double radius){
		this.radius=radius;
	}

/////////////Get
	public double getRadius(){
		return radius;
	}

}