//b.method.ex04;

public class Prob08{

	public Prob08(){
	}

	public void printSeason(int month){

			switch(month)
		{
				case 3:
			
				case 4:
					
				case 5:
					System.out.println("���� �¾�̳׿�.");
					break;
				case 6:
					
				case 7:
					
				case 8:
					System.out.println("������ �¾�̳׿�.");
					break;
				case 9:
					
				case 10:
				
				case 11:
					System.out.println("������ �¾�̳׿�.");
					break;
				case 12:
					
				case 1:
					
				case 2:
					System.out.println("�ܿ￡ �¾�̳׿�.");
					break;
				default:

					System.out.println("1~12 ������ ���ڸ� �Է��ϼž� �մϴ�.");
				break;
			
		}
		
	}

	public static void main(String[] args){

		int month=Integer.parseInt(args[0]);
//		new Prob08().printSeason(month);
		Prob08 mon=new Prob08();
		mon.printSeason(month);		
	}

}