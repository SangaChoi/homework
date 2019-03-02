package homework0918;

import java.util.Vector;


public class Prob03 {
	
	private static Book makeBook(String bookData) {
		
		String[] temp=bookData.split(" : ");
		
		if(temp.length !=3) {
			throw new DataFormatException(temp[0]+"책 정보는 변환할 수 없는 데이터 포맷입니다.");
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
			bookList.add(makeBook("Java Programming 기초 : 컴퓨터 : 35000"));
			bookList.add(makeBook("초보자를 위한 SQL : 컴퓨터 : 28000"));
			bookList.add(makeBook("HTML5 API 소개 : 컴퓨터 : 58000"));
			//case1
			bookList.add(makeBook("JDBC Programming 기초 : 컴퓨터 : 45000"));
			
			//case2
//			bookList.add(makeBook("JDBC Programming 기초 : 컴퓨터"));
			bookList.add(makeBook("JSP Programming 고급 : 컴퓨터 : 56000"));
		
			System.out.println("<<책 목록>>");
			printBookList(bookList);
			
		}catch(DataFormatException e){
			System.out.println(e.getMessage());
		}
		
	}
	

}
