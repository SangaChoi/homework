public class Prob09{

	public static void main(String[] args){

		int i=Integer.parseInt(args[0]);

		if(i==0 || i<0 || i%2==0){
			System.out.println("0보다 큰 홀수만 입력 가능합니다.");
		}else{

		

				for(int k=1;k<=i;k++){
					System.out.print("*");
				}

				i=i-2;
				System.out.println("\n");

			

			
			
				
			

		}
		
	}
}