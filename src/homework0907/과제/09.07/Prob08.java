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
					System.out.println("봄에 태어나셨네요.");
					break;
				case 6:
					
				case 7:
					
				case 8:
					System.out.println("여름에 태어나셨네요.");
					break;
				case 9:
					
				case 10:
				
				case 11:
					System.out.println("가을에 태어나셨네요.");
					break;
				case 12:
					
				case 1:
					
				case 2:
					System.out.println("겨울에 태어나셨네요.");
					break;
				default:

					System.out.println("1~12 사이의 숫자만 입력하셔야 합니다.");
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