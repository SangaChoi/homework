public class Example5re{

	public static void main(String args[]){

	String[][] text=new String[9][9];



		for(int l=1;l<10;l++){
			System.out.println(l+"���� ����մϴ�.");
			for(int j=1;j<10;j++){
				String abc=l+"*"+j+"="+l*j; //append�Ǿ� string���� ����ȯ
				text[l-1][j-1]=abc;
				System.out.println("text["+(l-1)+"]["+(j-1)+"] : "+l+"*"+j+"="+l*j);
			
			}

		}

	}

}