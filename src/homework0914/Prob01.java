package homework0914;

public class Prob01 {
	
	public static String myReplace(String str, char oldChar, char newChar) {
		
		String result="";
		
		for(int i=0; i<=str.length()-1; i++) {
			if(str.charAt(i)==oldChar) {
				result +=newChar;
			}else {
				result +=str.charAt(i);
			}
		}return result;
	}
	
	public static void main(String[] args) {
		
		System.out.println("���ڿ��� Ư������ �����ϴ� �׽�Ʈ");
		System.out.println("=====Sample 1=====");
		System.out.println(myReplace("hello world",'l','*'));
		
		System.out.println("=====Sample 2=====");
		System.out.println(myReplace("hello world",' ','-'));
		
		System.out.println("=====Sample 3=====");
		System.out.println(myReplace("hello world",'a','*'));
		
		
	}

}
