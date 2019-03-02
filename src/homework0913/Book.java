public class Book{

/////////////Field
	private String title=null;
	private int price=0;

/////////////Constructor
	public Book(){
	}
	public Book(String title, int price){
		this.title=title;
		this.price=price;
	}

//////////////Set
	public void setTitle(String title){
		this.title=title;
	}
	public void setPrice(int price){
		this.price=price;
	}

/////////////Get
	public String getTitle(){
		return title;
	}
	public int getPrice(){
		return price;
	}

}