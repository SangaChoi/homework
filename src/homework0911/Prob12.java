package homework0911;

public class Prob12 {

	public static void main(String[] args) {
		
		String sourceString="everyday we have is one more than we deserve";
		String encodedString="";

		for(int i=0; i<sourceString.length(); i++) {
			char current=sourceString.charAt(i);
			if(current==' ') {
				encodedString +=' ';
			}else if(current=='x'||current=='y'||current=='z') {
				encodedString +=(char)(current-23);
			}else {
				encodedString +=(char)(current+3);
			}
		}
		
		System.out.println("��ȣȭ�� ���ڿ� : "+sourceString);
		System.out.println("��ȣȭ�� ���ڿ� : "+encodedString);
	}

}
