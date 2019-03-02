public class BookMgr extends Book{

/////////////Field
	public Book[] booklist=null;

/////////////Constuctor
	public BookMgr(){
	}
	public BookMgr(Book[] booklist){
		this.booklist=booklist;
	}

///////////////Method

	public void printBooklist(){
		for(int i=0; i<=booklist.length-1; i++)
			System.out.println(booklist[i].getTitle());
	}
	public void printTotalPrice(){
		int sum=0;
		for(int i=0; i<=booklist.length-1; i++){
			sum +=booklist[i].getPrice();			
		}
		System.out.println(sum);
	}

}