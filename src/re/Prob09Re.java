public class Prob09Re{

	public static void main(String[] args){

		int count=Integer.parseInt(args[0]);

		if (args.length !=1){
			System.out.println("���� �������� �Է��ϼ���.");
			return;
		}

		if(count==0 || count<0 || count%2==0){
			System.out.println("0���� ū Ȧ���� �Է� �����մϴ�.");
			System.exit(0);
		}
		
		int i=0;

		while(i<count){
			for(int j=0; j<count; j++){
				if(j<i/2){
					System.out.print(" ");
				}else if(j>= count-i/2){
					System.out.print(" ");
				}else{
					System.out.print("*");
				}
			}
			System.out.print("\n");
			i+= 2;
		}		
		
	}

}