public class Prob09{

	public static void main(String[] args){

		int input=Integer.parseInt(args[0]);
		int k;
		int j=0;
		int a;

		if (args.length !=1){
			System.out.println("���� �������� �Է��ϼ���.");
			return;
		}

		if(input==0 || input<0 || input%2==0){
			System.out.println("0���� ū Ȧ���� �Է� �����մϴ�.");
		}else{
				for(k=0;k<input;k++){
					System.out.println("k : "+k);
					System.out.println("j : "+j);

					for(j=0;j<k;j++){
						System.out.print(" ");
					}
					for(a=0;a<input-k;a++){
						System.out.print("*");
					}
					System.out.println();

				}

			

			
			
				
			

		}
		
	}
}