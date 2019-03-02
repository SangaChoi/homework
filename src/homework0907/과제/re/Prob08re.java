//b.method.ex04;

public class Prob08re{

	public Prob08re(){
	}

	public void printSeason(int month){

		String season="봄";

			switch(month)
		{
				case 3:
			
				case 4:
					
				case 5:
					break;
				case 6:
					
				case 7:
					
				case 8:
					season="여름";
					break;
				case 9:
					
				case 10:
				
				case 11:
					season="가을";
					break;
				case 12:
					
				case 1:
					
				case 2:
					season="겨울";					
					break;
				default:
					System.out.println("1~12 사이의 숫자만 입력하셔야 합니다.");
				break;
			
		}
		System.out.println(season+"에 태어나셨네요.");
		
	}

	public static void main(String[] args){

		new Prob08re().printSeason(Integer.parseInt(args[0]));	
	}

}