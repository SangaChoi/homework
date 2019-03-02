//b.method.ex06

import java.util.Scanner;

public class FactorialUtilRe{

	public FactorialUtilRe(){
	}


	public int factorial(int n){
		int inputInt=n;
	    int pro=1;


		if(inputInt<2 || inputInt>9){
			return 0;
		}

		for(int i=1;i<=inputInt;i++){
			pro=pro*i;
				System.out.println(i+" ! = "+pro);
		}
		return pro;
			
	}

	public static void main(String[] args){

		Scanner keyboard=new Scanner(System.in);
		System.out.print("input   =    ");

		FactorialUtilRe util=new FactorialUtilRe();
		System.out.print("Result = "+util.factorial(keyboard.nextInt()));
	}
}