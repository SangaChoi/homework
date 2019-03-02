public class Prob13{

	public String leftPad(String str, int size, char padChar){

		if(str.length()<size){
			for(int i=1; i<=size-str.length(); i++){
				System.out.print(padChar);
			}
		}

		return str;
	}

	public static void main(String args[]){

		Prob13 prob3=new Prob13();

		System.out.println(prob3.leftPad("ABC", 6, '#'));
		System.out.println(prob3.leftPad("ABC", 5, '$'));
		System.out.println(prob3.leftPad("ABC", 2, '&'));
	}
}