package homework0918;

import java.util.Vector;


public class Prob03 {
	
	private static Book makeBook(String bookData) {
		
		String[] temp=bookData.split(" : ");
		
		if(temp.length !=3) {
			throw new DataFormatException(temp[0]+"å ������ ��ȯ�� �� ���� ������ �����Դϴ�.");
		}
		
		Book book=new Book();
		book.setTitle(temp[0]);
		book.setKind(temp[1]);
		book.setRentalPrice(Integer.parseInt(temp[2]));
		
		return book;
	}
	
	private static void printBookList(Vector bookList) {
		for(Object obj:bookList) {
			System.out.println(obj);
		}
	}

	public static void main(String[] args) {
		
		Vector bookList=new Vector();
		
		try {
			bookList.add(makeBook("Java Programming ���� : ��ǻ�� : 35000"));
			bookList.add(makeBook("�ʺ��ڸ� ���� SQL : ��ǻ�� : 28000"));
			bookList.add(makeBook("HTML5 API �Ұ� : ��ǻ�� : 58000"));
			//case1
			bookList.add(makeBook("JDBC Programming ���� : ��ǻ�� : 45000"));
			
			//case2
//			bookList.add(makeBook("JDBC Programming ���� : ��ǻ��"));
			bookList.add(makeBook("JSP Programming ��� : ��ǻ�� : 56000"));
		
			System.out.println("<<å ���>>");
			printBookList(bookList);
			
		}catch(DataFormatException e){
			System.out.println(e.getMessage());
		}
		
	}
	

}
