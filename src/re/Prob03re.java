//package a.base.ex03.ans;

import java.util.Scanner;

public class Prob03re{

	public static void main(String[] args){

		Scanner keyboard=new Scanner(System.in);
		System.out.print("1���� ũ�� 10���� ���� ������ �Է��ϼ���. : ");

		int inputInt=keyboard.nextInt();
		
		if(inputInt<2 || inputInt>9){
			System.out.println("�߸��� ���ڰ� �ԷµǾ����ϴ�.");
			return;
		}

		int result=1;

		for(int i=1;i<=inputInt;i++){
			result=1;
			for(int j=2;j<=i;j++){
				result*=j;
			}
			System.out.println(i+"!="+result);
		}
	}
}