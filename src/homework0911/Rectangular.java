public class Rectangular extends Shape{

////////////Field
	private double width=0;
	private double hight=0;

///////////Constructor
	public Rectangular(){
	}
	public Rectangular(String name, int width, int hight){
		super(name);
		this.width=width;
		this.hight=hight;
	}

/////////////Method
	public void calculationArea(){
		super.area=width*hight;
	}

///////////////Set
	public void setWidth(double width){
		this.width=width;
	}
	public void setHight(double hight){
		this.hight=hight;
	}

/////////////Get
	public double getWidth(){
		return width;
	}
	public double getHight(){
		return hight;
	}

}