import java.util.Scanner;

public class Prob03{

	public static void main(String[] args){

		Scanner keyboard=new Scanner(System.in);
		System.out.print("1���� ũ�� 10���� ���� ������ �Է��ϼ���. : ");

		int inputInt=keyboard.nextInt();
		int pro=1;

		if(inputInt<2 || inputInt>9){
			System.out.println("�߸��� ���ڰ� �ԷµǾ����ϴ�.");
			return;
		}

		for(int i=1;i<=inputInt;i++){
			pro=pro*i;
				System.out.println(i+" ! = "+pro);
		}
			

	
	}//

}//